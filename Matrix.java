package matrix;

import exception.MyException;
import exception.ProdException;
import exception.SumException;

public class Matrix {
    protected int [][] array;
    protected int r = 0;
    protected int c = 0;

    public Matrix(int row1, int column1) {
        array = new int [row1][column1];
        r = row1; c = column1;
        for(int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                array[i][j] = 0;
    }

    public Matrix sum (Matrix a) throws SumException {
        if(r != a.r || c != a.c) {
            throw new SumException("The matrices in the method sum have a different size\n");
        }
        else {
            Matrix res = new Matrix(r, c);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int tmp = a.getElement(i,j) + this.getElement(i,j);
                    res.setElement(i, j, tmp);
                }
            }
            return res;
        }
    }

    public Matrix product(Matrix a) {
        if(c != a.r)
            throw new ProdException("The matrices in the method product have a different size");
        else {
            Matrix res = new Matrix(r, a.c);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < a.c; j++) {
                    res.setElement(i, j, 0);
                    for (int k = 0; k < c; k++) {
                        res.setElement(i,j, res.getElement(i, j) + (this.getElement(i,k) * a.getElement(k,j)));
                        // res.array[i][j] = res.array[i][j] + array[i][k] * a.array[k][j];
                    }
                }
            }
            return res;
        }
    }

    public void setElement(int row1, int column1, int value){
        if(row1 >= r || column1 >= c)
            throw new MyException("Going out of the array in method setElement\n");
        else {
            array[row1][column1] = value;
        }
    }

    public int getElement(int row1, int column1) {
        if(row1 >= r || column1 >= c)
            throw new MyException("Going out of the array in method getElement\n");
        else {
            return array[row1][column1];
        }
    }

    public String toString()  {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                    res.append(" ").append(getElement(i,j));
            }
            res.append("\n");
        }
        return  res.toString();
    }

    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Matrix))
            return false;
        Matrix a = (Matrix) obj;
        if (r != a.r || c != a.c)
            return false;

        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (this.getElement(i, j) != a.getElement(i, j))
                    flag++;
            }
        }
        if (flag == 0)
            return true;
        return false;
    }
}

// checked exception = проверяемое исключение, проверяемое компилятором
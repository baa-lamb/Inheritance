package matrix;

import exception.MyException;

public class SquareMatrix extends Matrix {

    public SquareMatrix(int size) {
        super(size, size);
        r = c = size;
        for(int i = 0; i < r; i++)
            for(int j = 0; j < r; j++)
                if(i == j)
                    array[i][j] = 1;
    }


    public SquareMatrix sum (SquareMatrix a) throws MyException {
        if(r != a.r && c != a.c)
            throw new MyException("The matrices in the method sum have a different size");
        else {
           // SquareMatrix res = new SquareMatrix(array.length);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    array[i][j] = a.array[i][j] + array[i][j];
                }
            }
            return this;
        }
    }


}
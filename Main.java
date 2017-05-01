import matrix.SquareMatrix;
import matrix.AllMatrix;
import matrix.Matrix;
import exception.ProdException;
import exception.MyException;
import exception.SumException;


public class Main {
    public static void main (String[] args){
        Matrix a = new Matrix(3,4);
        Matrix b = new Matrix(4,3);
        Matrix c = new Matrix(3,4);

        for(int i = 0; i < 3; i++){
            try{
                a.setElement(i,0,i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(a);
        for(int i = 0; i < 3; i++){
            try{
                b.setElement(0,i,i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        try {
            a.sum(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Matrix d = new SquareMatrix(4);

        for(int i = 0; i < 4; i++)
            try{
                d.setElement(0,i,2*i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        System.out.println(d);
        Matrix f = new SquareMatrix(4);
        for(int i = 0; i < 4; i++)
            try{
                f.setElement(0,i,i+1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        System.out.println(f);

        if(f.equals(d))
            System.out.println(1);
        else
            System.out.println(0);

        try {
            System.out.println(d.product(f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Matrix n = new AllMatrix(3,4);

        try {
            n.setElement(1,2,5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(n);


    }
}

package matrix;
import exception.MyException;
/**
 * Created by Алена on 22.03.2017.
 */
public class AllMatrix extends Matrix {

    public AllMatrix(int size1, int size2) {
        super(1, 1);
        r = size1;
        c = size2;
    }

    public void setElement(int row1, int column1, int value){
        if(row1 >= r || column1 >= c)
            throw new MyException("Going out of the array in method setElement");
        else {
            array[0][0] = value;
        }
    }

    public int getElement(int row1, int column1){
        if(row1 >= r || column1 >= c)
            throw new MyException("Going out of the array in method setElement");
        return array[0][0];
    }
}

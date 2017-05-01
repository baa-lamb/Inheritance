package exception;

public class ProdException extends RuntimeException {
    public ProdException(String message) {
        super(message);
    }
}


//info special for me
/*Эта конструкция служит цели «указать» программисту-читателю кода на то,
что ваш метод может выбросить некоторое непроверяемое (unchecked) исключение.*/
package exception.real.exceptions;

// Exception을 상속받으면 check 예외가 된다
public class MyCheckException extends RuntimeException{
    public MyCheckException(String message){
        super(message);
    }
}

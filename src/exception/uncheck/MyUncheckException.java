package exception.uncheck;

public class MyUncheckException extends RuntimeException{ // 언체크 예외
    public MyUncheckException(String message) {super(message);}
}

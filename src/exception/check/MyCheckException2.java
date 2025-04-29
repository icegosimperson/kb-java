package exception.check;

import java.util.Random;

// Exception을 상속받으면 check 예외가 된다
public class MyCheckException2 extends Exception{
    public MyCheckException2(String message){
        super(message);
    }
}

package exception.check;

import java.util.Random;

public class Client {
    public void callCheckException() throws MyCheckException {
        MyCheckException exception = new MyCheckException("Client callCheckException에서 발생");
        throw exception; // Option + Enter

    }
    public void callRandException() throws MyCheckException2{
        Random random = new Random();
        if(random.nextBoolean()){
            MyCheckException2 exception2 = new MyCheckException2("오늘은 운이 없으시군요");
            throw exception2; // 메세지를 예외의 상위 클래스에 전달하면서 예외를 던짐
        } else{
            System.out.println("오늘 운이 좋으시군요");
        }
    }
}

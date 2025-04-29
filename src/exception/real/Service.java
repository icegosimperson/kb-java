package exception.real;

import exception.check.MyCheckException;
import exception.uncheck.MyUncheckException;

public class Service {
    public static void main(String[] args) {
        try{
            Client client = new Client();
            client.callException();
            client.callException2();
        }catch (Exception e){
            // 모든 예외를 처리하는 메서드를 만들자
            exceptionHandler(e);
        }
    }
    public static void exceptionHandler(Exception e){
        if(e instanceof MyCheckException){
            System.out.println("MyCheckException에 대한 예외처리");
            MyCheckException exception = (MyCheckException) e; // 전체 Exception을 캐스팅 중요!
            e.printStackTrace();
            System.out.println("MyCheckException이 제공하는 메서드 사용");
        } else if(e instanceof MyUncheckException){
            System.out.println("MyUncheckException에 대한 예외처리");
            MyUncheckException exception = (MyUncheckException) e; // 전체 Exception을 캐스팅 중요!
            e.printStackTrace();
            System.out.println("MyUncheckException이 제공하는 메서드 사용");
        }
    }
}

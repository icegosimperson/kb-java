package ex.ch06.ex07;

public class Calculator {
    int x, y;
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    int plus(int x, int y){
       return x+y;
    }
    double divide(int x, int y){
        return (double)x/y;
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
}

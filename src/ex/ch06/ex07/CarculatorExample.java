package ex.ch06.ex07;

import ex.ch06.ex07.Calculator;

public class CarculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);
        myCalc.powerOff();
    }
}

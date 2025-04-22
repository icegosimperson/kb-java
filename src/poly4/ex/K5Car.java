package poly4.ex;

import java.util.Scanner;

public class K5Car implements Car{
    int fuel;
    static final int Eficiency = 1;
    Scanner sc = new Scanner(System.in);
    @Override
    public void fillFuel() {
        System.out.print("주유할 기름의 양을 입력하세요");
        fuel = sc.nextInt();
    }

    @Override
    public void openDoor() {
        System.out.println("K5 차 문을 엽니다");
    }

    @Override
    public void drive() {
        fillFuel();
        openDoor();
        System.out.println("K5가 주행을 시작합니다");
        System.out.println("K5는 총" + fuel/Eficiency + "km 만큼 달렸습니다");
        System.out.println("K5 주행 종료");
    }
}

package poly4.ex;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner sc = new Scanner(System.in);

    public void setCar(Car car){
        this.car = car;
    }
    public void selectCar(){
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5/ 2.그랜져) :");
        int option = sc.nextInt();

        if(option==1){
            this.setCar(new K5Car());
        } else if(option==2){
            this.setCar(new GrandeurCar());
        }
        drive();
    }


    public void drive(){
        car.drive();
    }
}

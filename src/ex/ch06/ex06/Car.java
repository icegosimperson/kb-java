package ex.ch06.ex06;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    public Car(){

    }

    public Car(String model) {
        this(model, "오렌지", 99999);
    }

    public Car(String model, String color) {
        this(model, color, 99999); // 매개변수를 못담는 값만 임의로 담아줌
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

package ex.ch06.ex06;

public class CarExample {
    public static void main(String[] args) {
        Car cCar1 = new Car();
        System.out.println("car1.company " + cCar1.company);
        System.out.println();

        Car cCar2 = new Car("자가용");
        System.out.println("car2.company " + cCar2.company);
        System.out.println("car2.model " + cCar2.model);
        System.out.println();

        Car cCar3 = new Car("자가용", "빨강");
        System.out.println("car3.company " + cCar3.company);
        System.out.println("car3.model " + cCar3.model);
        System.out.println("car3.color " + cCar3.color);
        System.out.println();

        Car cCar4 = new Car("택시", "검정", 200);
        System.out.println("car4.company " + cCar4.company);
        System.out.println("car4.model " + cCar4.model);
        System.out.println("car4.color " + cCar4.color);
        System.out.println("car4.maxSpeed " + cCar4.maxSpeed);

    }
}

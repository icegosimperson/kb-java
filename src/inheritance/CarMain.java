package inheritance;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        gasCar.fillUp();
        gasCar.move();
        gasCar.openDoor();

        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();

        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();
    }
}

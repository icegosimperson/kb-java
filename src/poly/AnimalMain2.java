package poly;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};

        for(Animal a : animals){
            soundAnimal(a);
        }
    }
    static void soundAnimal(Animal animal){ // 부모 클래스는 모든 자식클래스를 담을 수 있다
        animal.sound();

    }
}

package poly;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

//        donkey.sound();
//        dog.sound();
//        cat.sound();
//        chicken.sound();
        soundAnimal(donkey);
        soundAnimal(cat);
        soundAnimal(chicken);
        soundAnimal(dog);
    }
    static void soundAnimal(Animal animal){ // 부모 클래스는 모든 자식클래스를 담을 수 있다
        animal.sound();

    }
}

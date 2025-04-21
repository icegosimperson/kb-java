package poly2.casting.ex1;

// 부모한테 없는 메서드를 실행할 때 캐스팅
public class ex1Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

//        Dog poly1 = (Dog) dog;
//        Cat poly2 = (Cat) cat;

        ((Dog)dog).sound();
        ((Cat)cat).sound();
    }
}

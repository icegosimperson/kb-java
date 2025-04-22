package poly3.multiple;

public class Tetz implements Animal, Human{ // 다중 구현
    @Override
    public void eat() {
        System.out.println("테츠가 콜라를 마십니다");
    }

    @Override
    public void sleep() {
        System.out.println("테츠가 잠을 잘 못잡니다");
    }

    @Override
    public void think() {
        System.out.println("테츠가 생각을 합니다");
    }
}

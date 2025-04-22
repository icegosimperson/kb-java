package poly3.multiple;

public class TetzMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Tetz()};

        for(int i=0; i<animals.length; i++){
            animalDo(animals[i]);
            if(animals[i] instanceof Human){
                humanDo((Human) animals[i]); // 캐스팅해서 매개변수 동일하게 해줌
            }
        }
    }
    public static void animalDo(Animal animal){
        System.out.println("동물 기능 테스트");
        animal.eat();
        animal.sleep();
        System.out.println("동물 기능 테스트 종료");
    }
    public static void humanDo(Human human){
        System.out.println("사람 기능 테스트");
        human.think();
        System.out.println("사람 기능 테스트 종료");
    }
}

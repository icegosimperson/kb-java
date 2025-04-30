package generic.ex1;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(10);
        System.out.println(integerBox.getValue());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("오예");
        System.out.println(stringBox.getValue()); // 클래스 매번 선언할 필요 없이 유연해짐, 메서든다 타입을 편하게할 수 있음
    }
}

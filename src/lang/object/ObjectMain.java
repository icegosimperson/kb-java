package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod(); // 상속받은 메서드
        child.childMethod(); // 본인 메서드

        System.out.println(child.toString()); // 주소값
        System.out.println(Integer.toHexString(child.hashCode()));
    }
}

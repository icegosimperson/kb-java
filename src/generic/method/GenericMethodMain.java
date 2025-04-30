package generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer value = GenericMethod.<Integer>genericMethod(10); // static 변수니까 인스턴스화 없이 사용 가능
        System.out.println(value);

        Integer value3 = GenericMethod.genericMethod(10);
    }
}

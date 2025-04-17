package memory;

public class DataStaticmain {
    public static void main(String[] args) { // 인스턴스화 안해도 출력되게 하기 위함
        System.out.println(DataStatic.value); // 인스턴스화 안해도 출력됨
        DataStatic.showValue();
    }
}

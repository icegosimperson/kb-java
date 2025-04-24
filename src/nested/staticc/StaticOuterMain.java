package nested.staticc;

public class StaticOuterMain {
    public static void main(String[] args) {
        StaticOuter staticOuter = new StaticOuter(); // outer가 없는 조건 존재
        StaticOuter.Nested nested = new StaticOuter.Nested();
        nested.print();

//        staticOuter. private는 외부 접근 불가
//        nested.
    }
}

package nested.staticc;

public class StaticOuter {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    static class Nested{
        private static String nestedStatic = "innerStatic";
        private String nestedInstance = "nestedInstance";

        public void print(){ // 헬퍼 메서드
            // 클래스 내부의 static 값에 접근
            System.out.println("nestedStatic=" + nestedStatic);
            System.out.println("outerStatic=" + outerStatic);
            System.out.println("nestedInstance="+ nestedInstance);
//            System.out.println("outerInstance=" + outerInstance) ;
        }
    }
}

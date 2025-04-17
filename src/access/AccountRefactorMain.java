package access;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행", "silver", "이효석", 1000);
        // public 필드에 접근
        System.out.println("public 접근 제어자 확인");
        System.out.println("은행명은? " + account.bank);

        // default 필드에 접근 : 같은 패키지안 변수만 접근 가능
        System.out.println("default 접근 제어자 확인");
        System.out.println("이 회원의 등급은? " + account.grade);

        // private 필드에 접근
//        System.out.println("private 접근 제어자 확인");
//        System.out.println("이름은? " + account.name);
//        System.out.println("잔고는? " + account.total);

    }
}

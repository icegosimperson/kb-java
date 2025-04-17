package access;

public class AccountRefactor {
    public String bank; // 은행명
    String grade; // 회원 등급
    private String name; // 계좌 소유
    private int total;

    public AccountRefactor(String bank, String grade, String name, int total) {
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.total = total;
    }
    void deposit(int amount){
        this.total += amount;
    }
    void withdraw(int amount){
        this.total -= amount;
    }
}

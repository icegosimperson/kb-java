package access;

public class BankAccount {
    private int balance;
    public BankAccount() {this.balance = 0;}
    public int getBalance(){
        return balance; // balance 조회 가능하지만 외부에서 값을 변경할 수는 없음 (사용자가 허용하는 범위에서는 사용할 수 있음)
    }
}

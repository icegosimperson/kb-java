package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("은행 잔고는" + bankAccount.getBalance()); // 가능
//        System.out.println(bankAccount.balance); error
    }
}

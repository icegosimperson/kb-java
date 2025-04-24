package nested.example2;

public class NestedAccountMain {
    public static void main(String[] args) {
        Account account = new Account("이효석", 1000);
        Account acount2 = new Account("채수정", 100000000);

        Account.StaticAccountStatus.showStaus();
//        Account.InnerAccountStatus inner = acount2.new InnerAccountStatus();
//        inner.showStaus();
        acount2.showInnerStatus();
    }
}
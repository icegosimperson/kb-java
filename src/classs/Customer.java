package classs;

public class Customer {
    String name="아직 몰라요";
    int age=0;
    int total=0;
    boolean blacklist=false;

    Customer() {
    }

    public Customer(String name, int age, int total, boolean blacklist) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.blacklist = blacklist;
    }
    void printCustomer(){
        System.out.println("고객의 이름은?" + this.name);
        System.out.println("고객의 나이는?" + this.age);
        System.out.println("고객이 총 사용한 금액은?" + this.total);
        System.out.println("고객은 블랙리스트인가요!?" + this.blacklist);
    }
}

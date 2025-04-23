package lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("John");
        ImmutableUser user2 = user1; // 참조값을 넘겨줌
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        user2 = new ImmutableUser("준범");
        System.out.println("user2:의 이름을 준범으로 변경 ");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}

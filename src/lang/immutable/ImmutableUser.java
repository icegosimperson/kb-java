package lang.immutable;

public class ImmutableUser {
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    } 불변객체는 setter가 없어야함

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}

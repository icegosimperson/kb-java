package poly2.instance;

public class InstanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandChild = new GrandChild();

        System.out.println(parent instanceof Parent); // t
        System.out.println(child instanceof Parent); // t
        System.out.println(grandChild instanceof Parent); // t

        System.out.println(parent instanceof Child); // f
        System.out.println(child instanceof Child); // f
        System.out.println(grandChild instanceof Child); // t

        System.out.println(parent instanceof GrandChild); // f
        System.out.println(child instanceof GrandChild); // f
        System.out.println(grandChild instanceof GrandChild); // t
    }
}

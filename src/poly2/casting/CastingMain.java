package poly2.casting;

public class CastingMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        Parent parent = new Child();
        parent.parentMethod();
//        poly.childMethod(); cnanot find symbol variable poly

        Child poly = (Child) parent;
        poly.childMethod();

        ((Child) parent).childMethod();
    }
}

package poly2.casting;

public class CastingMain2 {
    public static void main(String[] args) {
//        Child child = new Child();
//        Parent parent1 = child;
//        Parent parent2 = (Parent) child;
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}

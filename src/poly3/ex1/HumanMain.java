package poly3.ex1;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = {new Korean(), new American(), new Spanish()};
        for(Human h : humans){
            h.speak();
            h.eat();
            h.hello();
        }
    }
}

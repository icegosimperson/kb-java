package generic.method;

public class GenericMethod {
    public static <T> T genericMethod(T t){
        System.out.println("GenericMEthod " + t);
        return t;
    }
}

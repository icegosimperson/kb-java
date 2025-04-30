package generic.limit;

public class GenericWorld <T extends Number>{ // extends로 타입 제한
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
    public double transDouble(){
        return this.number.doubleValue();
    }
}

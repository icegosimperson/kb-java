package generic.ex1;

/*
// 모든 타입이 저장간으한 박스를 만드려면 다형성 Object
// 다운캐스팅 해줘야 하거나 타입에 안맞는 인수 전달 시 다운 캐스팅이 어려움
 */
public class GenericBox<Type> {
    private Type value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}

package memory;

public class Data {
    public int value;

    Data(int value) { // default 앞에 생략되어있음
        this.value = value;
    }
    public int getValue(){ // getter
        return this.value;
    }
}

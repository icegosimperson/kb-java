package exception.real;

import exception.real.exceptions.MyCheckException;
import exception.real.exceptions.MyUncheckException;

public class Client {
    public void callException() {
        // 런타임으로 쓸거니까 Throw 필요 없음
        throw new MyCheckException("callExcpetion에서 발생");
    }
    public void callException2(){
        throw new MyUncheckException("callException에서 발생");
    }
}

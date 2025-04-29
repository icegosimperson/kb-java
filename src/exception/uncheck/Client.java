package exception.uncheck;

public class Client {
    public void callUncehckException() {
        throw new MyUncheckException("Client callUncheckException 에서 발생");
    }
}

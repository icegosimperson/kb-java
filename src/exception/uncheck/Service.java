package exception.uncheck;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try{
            client.callUncehckException();
        } catch (MyUncheckException e){
            e.printStackTrace();
        }
        System.out.println("막았는가?");
    }
}

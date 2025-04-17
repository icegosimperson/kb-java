package inheritance;

public class GasCar extends Car{
    @Override // 오버라이드 룰을 지키는지 확인해줌 -> error -> override compile error
    public void move(){ // 오버라이딩(재정의)
        System.out.println("휘발유를 이동 합니다");
    }
    @Override
    public void openDoor(){
        System.out.println("휘발차 문을 엽니다");
    }

    public void fillUp(){
        System.out.println("휘발유를 주유 합니다");
    }
}

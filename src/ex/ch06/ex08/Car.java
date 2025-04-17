package ex.ch06.ex08;

public class Car {
    int gas;
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas<=0){
            System.out.println("gas가 없습니다");
            return false;
        } else{
            System.out.println("gas가 있습니다");
            return true;
        }
    }

    void run() {
        while(isLeftGas()){
            System.out.println("달립니다. (gas 잔량)" + this.gas);
            this.gas--;
        }
        System.out.println("멈춥니다. (gas 잔량): " + this.gas);
        System.out.println("gas를 주입하세요");
        return;
    }
}

package poly3.abstractt;

public class Duck extends AbstractAnimal {
    
   @Override
    public void sound(){
        System.out.println("오리는 꽥꽥");
    }

    @Override
    public void eat() {
        System.out.println("오리는 사료를 먹습니다");
    }

    public void fly(){
        System.out.println("오리 날다!");
    }
}

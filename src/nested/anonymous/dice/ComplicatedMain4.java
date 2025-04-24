package nested.anonymous.dice;

import java.util.Random;

public class ComplicatedMain4 {
    public static void complicatedProgram(Dice dice){  /*외부로 코드 덩어리 받아오기*/
        System.out.println("프로그램 시작 작업");
        // 받아온 코드 실행
        dice.run();
        System.out.println("프로그램 종료 작업");
    }


    public static void main(String[] args) {
        complicatedProgram(        new Dice(){ // 쓰임이 끝나는 순간 가비지 컬렉터가 처리
            @Override
            public void run(){
                int rand = new Random().nextInt(6)+1;
                System.out.println("주사위 값은" + rand);
            }
        });
    }
}

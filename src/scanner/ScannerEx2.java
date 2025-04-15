package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        while(true){
            System.out.print("랜덤 숫자를 입력하세요 :");
            int num = sc.nextInt();
            if(num == random){
                System.out.println("정답입니다! 랜덤 숫자는 " + random);
                break;
            } else if(num > random){
                System.out.println("Down");
            } else{ // num < random
                System.out.println("Up");
            }
        }
    }
}

package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 점수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("종료 정수를 입력하세요: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("시작 정수가 종료 정수 보다 큽니다!!");
        }
        else{
            int sum = 0;
            for(int i=a; i<=b; i++){
                sum += i;
            }
            System.out.println("시작 수부터 종료 수까지의 합은" + sum);
        }
    }
}

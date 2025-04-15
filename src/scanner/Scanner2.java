
package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력 하세요: ");
        int num1 = sc.nextInt(); // 사용자 입력을 문자열로 받기
        System.out.println("입력할 정수는 " + num1);

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("입력한 정수는 " + num2);

        int sum = num1 + num2;
        System.out.println("두 수의 합은: " + sum);
    }
}

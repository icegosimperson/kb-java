package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 하세요: ");
        String str = sc.nextLine(); // 사용자 입력을 문자열로 받기
        System.out.println("입력할 문자열은" + str);

        System.out.print("정수를 입력하세요: ");
        int intNum = sc.nextInt();
        System.out.println("입력한 정수는" + intNum);

        System.out.print("실수를 입력하세요: ");
        double doubleNum = sc.nextDouble();
        System.out.println("입력한 실수는" + doubleNum);
    }
}

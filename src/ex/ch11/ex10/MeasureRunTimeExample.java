package ex.ch11.ex10;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int sum = 0;
        for(long i=0; i<1000000; i++){
            sum += i;
        }
        long endTime = System.nanoTime();
        System.out.println("합산 결과는:" +sum);
        long time = endTime -startTime;
        System.out.println("계산에 걸린 시간은 결과는 :" + sum);
    }
}
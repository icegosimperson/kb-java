package ex.ch06.ex09;

public class Computer {

    int sum(int... values){
        int total = 0;
        for(int i : values){
            total += i;
        }
        return total;
    }
}

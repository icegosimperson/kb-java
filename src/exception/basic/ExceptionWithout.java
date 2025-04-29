package exception.basic;

public class ExceptionWithout {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 5;

        if(index < arr.length){
            System.out.println(arr[index]);
        } else {
            System.out.println("출력?");
        }
    }
}

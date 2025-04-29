package exception.basic;

public class ExceptionWith {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            accessArr(arr, 5);
            Object object = null;
            accessNull(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean accessArr(int[] arr, int index){
        if(index < arr.length){
            return true;
        } else {
            return false;
        }
    }
    private static boolean accessNull(Object obj){
        if(obj==null){
            return true;
        } else{
            return false;
        }
    }
}

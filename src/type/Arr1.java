package type;

public class Arr1 {
    public static void main(String[] args) {
        String[] students;
        students = new String[6];

        students[0] = "홍길동1";
        students[1] = "홍길동2";
        students[2] = "홍길동3";
        students[3] = "홍길동4";
        students[4] = "홍길동5";
        students[5] = "홍길동6";

        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
    }
}

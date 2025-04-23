package ex.ch11.ex14;


import java.text.SimpleDateFormat;
import java.util.Date;
public class DataExample {
    public static void main(String[] args) {
        Date data = new Date();
        String dateString = data.toString();
        System.out.println(dateString);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String dateString2 = sdf.format(data);
        System.out.println(dateString2);
    }
}

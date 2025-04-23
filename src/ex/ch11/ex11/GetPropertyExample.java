package ex.ch11.ex11;

import java.util.Properties;

public class GetPropertyExample {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println(os);
        System.out.println(userName);
        System.out.println(userHome);

        Properties props = System.getProperties();
        System.out.println(props);
    }
}
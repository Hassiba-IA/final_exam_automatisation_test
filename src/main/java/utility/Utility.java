package utility;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Properties;

public class Utility {
    public static String currentDir = System.getProperty("user.dir");
    public static Properties loadProperties(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(currentDir+ File.separator+"src\\test\\test_output"+File.separator+"config.properties"));
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }


    public static void encode(String[] args) {
        String username = "";
        String securedUsername;
        String password = "";

        securedUsername = Base64.getEncoder().encodeToString(username.getBytes());
        System.out.println(securedUsername);
    }

    public static String decode(String key){
        byte[] decodedBytes = Base64.getDecoder().decode(key);
        return new String(decodedBytes);
    }
    public static void main(String[] args) {
        String username = "";
        String securedUsername;
        String password = "";

        securedUsername = Base64.getEncoder().encodeToString(username.getBytes());
        System.out.println(securedUsername);
    }
}

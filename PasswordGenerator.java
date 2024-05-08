import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        int length = 12;
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        Random random = new Random();
        String password = "";
        for (int i = 0; i < length; i++) {
            password += characters.charAt(random.nextInt(characters.length()));
        }
        System.out.println(password);
    }
}
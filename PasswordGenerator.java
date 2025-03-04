import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 10; // Desired length of the password
        System.out.println("Generated Password: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charSet.length());
            password.append(charSet.charAt(index));
        }

        return password.toString();
    }
}

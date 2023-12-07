import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunctionExample {

    public static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());

            // Convert byte array to hexadecimal representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle exception appropriately
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "AbhishekTodmal";
        String hashedValue = hashString(input);

        System.out.println("Input: " + input);
        System.out.println("Hashed Value: " + hashedValue);
        byte b=127;
        System.out.println(b);
    }
}

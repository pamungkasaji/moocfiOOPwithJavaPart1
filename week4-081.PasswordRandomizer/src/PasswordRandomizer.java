import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private int length;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private Random random;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // Write the code here which returns the new password
        String pass = "";
        while (pass.length() < this.length){
            pass = pass + alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return pass;
    }
}
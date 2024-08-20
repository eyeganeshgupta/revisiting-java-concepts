package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P06GeneratingRandomBytes {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a byte array of random bytes
        byte[] byteArray = new byte[5];
        random.nextBytes(byteArray);

        // Print the random bytes
        System.out.print("Random Bytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}

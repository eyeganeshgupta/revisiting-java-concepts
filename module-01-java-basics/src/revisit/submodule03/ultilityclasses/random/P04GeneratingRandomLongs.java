package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P04GeneratingRandomLongs {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);
    }
}

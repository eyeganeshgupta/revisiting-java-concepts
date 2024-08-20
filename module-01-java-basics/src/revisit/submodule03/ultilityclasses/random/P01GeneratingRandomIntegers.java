package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P01GeneratingRandomIntegers {
    public static void main(String[] args) {
        System.out.println("The Random class in Java is used to generate random numbers, booleans, and other values.");
        // Create an instance of Random
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer within a range (e.g., 0 to 99)
        int randomIntInRange = random.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntInRange);
    }
}

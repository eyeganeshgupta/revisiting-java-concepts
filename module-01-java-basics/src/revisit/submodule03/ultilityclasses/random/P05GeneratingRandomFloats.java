package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P05GeneratingRandomFloats {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random float
        float randomFloat = random.nextFloat();
        System.out.println("Random Float: " + randomFloat);
    }
}

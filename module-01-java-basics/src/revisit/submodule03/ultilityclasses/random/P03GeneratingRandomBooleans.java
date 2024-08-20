package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P03GeneratingRandomBooleans {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}

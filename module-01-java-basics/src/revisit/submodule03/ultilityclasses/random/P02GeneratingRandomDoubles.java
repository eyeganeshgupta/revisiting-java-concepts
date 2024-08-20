package revisit.submodule03.ultilityclasses.random;

import java.util.Random;

public class P02GeneratingRandomDoubles {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();

        // Generate a random double
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}

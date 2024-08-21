package revisit.submodule03.ioclasses.console;

import java.io.Console;
import java.util.Arrays;

public class P04ReadingAndMaskingSensitiveInformation {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            // Read and mask sensitive information
            char[] creditCardNumber = console.readPassword("Enter your credit card number: ");

            // Simulate some processing
            console.printf("Processing your card ending in %s...\n",
                    new String(creditCardNumber).substring(12));

            // Clear the sensitive information from memory
            Arrays.fill(creditCardNumber, ' ');
        } else {
            System.out.println("No console available.");
        }
    }
}

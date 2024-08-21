package revisit.submodule03.ioclasses.console;

import java.io.Console;

public class P03ReadingInputWithACustomPrompt {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            // Custom prompt for reading input
            String response = console.readLine("[Y/N] Do you want to continue? ");
            if ("Y".equalsIgnoreCase(response)) {
                console.printf("Continuing...\n");
            } else {
                console.printf("Stopping...\n");
            }
        } else {
            System.out.println("No console available.");
        }
    }
}

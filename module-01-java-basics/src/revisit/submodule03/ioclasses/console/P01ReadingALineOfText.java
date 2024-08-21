package revisit.submodule03.ioclasses.console;

import java.io.Console;

public class P01ReadingALineOfText {
    public static void main(String[] args) {
        // Get the system console
        Console console = System.console();

        // Check if the console is available
        if (console != null) {
            // Read a line of text from the console
            String input = console.readLine("Enter your name: ");
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No console available.");
        }
    }
}

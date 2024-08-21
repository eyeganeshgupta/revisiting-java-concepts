package revisit.submodule03.ioclasses.console;

import java.io.Console;

public class P06ExceptionHandlingWithConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            try {
                // Attempt to read an integer value from the console
                String input = console.readLine("Enter a number: ");
                int number = Integer.parseInt(input);
                console.printf("You entered: %d\n", number);
            } catch (NumberFormatException e) {
                console.printf("Invalid number format. Please enter a valid integer.\n");
            }
        } else {
            System.out.println("No console available.");
        }
    }
}

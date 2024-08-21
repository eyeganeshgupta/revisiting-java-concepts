package revisit.submodule03.ioclasses.console;

import java.io.Console;

public class P02ReadingAPassword {
    public static void main(String[] args) {
        System.out.println("\nThe ‘Console’ class in Java, part of the ‘java.io’ package, provides methods to interact with the console, allowing for reading user input and printing formatted output. It is particularly useful in command-line applications.\n");

        Console console = System.console();

        if (console != null) {
            // Read a password from the console (without echoing it)
            char[] passwordArray = console.readPassword("Enter your password: ");

            String password = new String(passwordArray);
            System.out.println("Password entered: " + password);
        } else {
            System.out.println("No console available.");
        }
    }
}

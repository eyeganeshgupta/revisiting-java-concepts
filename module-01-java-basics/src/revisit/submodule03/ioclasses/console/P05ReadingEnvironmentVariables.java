package revisit.submodule03.ioclasses.console;

import java.io.Console;

public class P05ReadingEnvironmentVariables {
    public static void main(String[] args) {
        // Get the system console
        Console console = System.console();

        if (console != null) {
            // Retrieve an environment variable
            String javaHome = console.readLine("JAVA_HOME: %s\n", System.getenv("JAVA_HOME"));

            console.printf("Your JAVA_HOME is: %s\n", javaHome);
        } else {
            System.out.println("No console available.");
        }
    }
}

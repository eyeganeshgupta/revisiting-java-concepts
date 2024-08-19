package revisit.submodule02.commandlinearguments;

/**
 * The CMDLineArgs01 class demonstrates how to handle command-line arguments in Java.
 * Command-line arguments are passed to the program at runtime and can be accessed
 * using the 'args' reference.
 */
public class CMDLineArgs01 {

    /**
     * The main() method is the entry point of the program.
     * It prints the number of command-line arguments passed to the program.
     *
     * @param args An array of Strings that stores command-line arguments.
     */
    public static void main(String[] args) {
        /*
            ❓ What is 'args'?
            👉 'args' is a reference to an array of references to String objects.
            Each element of this array corresponds to a command-line argument passed
            to the program when it is executed.
        */
        System.out.println("Number of command-line arguments: " + args.length);
    }
}

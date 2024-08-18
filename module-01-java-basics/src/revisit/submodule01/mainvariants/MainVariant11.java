package revisit.submodule01.mainvariants;

/**
 * The MainVariant11 class demonstrates the use of a static block in Java.
 * Static blocks are executed when the class is loaded into memory, before the main() method is called.
 * This example highlights three key points about static blocks.
 */
public class MainVariant11 {

    // Static block - executes once when the class is loaded
    static {
        System.out.println("Three important points about the static block:");
        System.out.println("1. The static block runs automatically.");
        System.out.println("2. It runs before any other blocks, including the main() method.");
        System.out.println("3. It executes only once during the class's lifecycle.\n");
    }

    /**
     * The main() method serves as the entry point of the program.
     * This is where the execution of the program begins after the class is loaded.
     */
    public static void main(String[] args) {
        System.out.println("main() method called!");
    }
}

package revisit.submodule01.mainvariants;

public class ExecutionOrderOfMainClass {
    public static void main(String[] args) {
        System.out.println("1. Start JVM");
        System.out.println("2. Create and start main-thread");
        System.out.println("3. Locate the .class file which has to be executed");
        System.out.println("\t› If this step fails then we get the ClassNotFoundException");
        System.out.println("4. Check for main() method");
        System.out.println("\t› If this step fails then we get the error Main method not found and the process stops");
        System.out.println("5. Load the Main class and execute initialization of any static variables and static block");
        System.out.println("6. Call and execute the main() method");
        System.out.println("7. Terminate the main-thread");
        System.out.println("8. Unload the class");
        System.out.println("9. Shutdown the JVM");
    }
}

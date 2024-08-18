package revisit.submodule01.mainvariants;

public class MainVariant09 extends Parent {
    public static void main(String[] args) {
        System.out.println("Child main method called.");
        System.out.println("The child class can have the main() method redefined.");
        System.out.println("\nCan we call it overriding?");
        System.out.println("No, it is called method hiding.");
    }
}

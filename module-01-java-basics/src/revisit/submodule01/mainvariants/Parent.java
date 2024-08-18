package revisit.submodule01.mainvariants;

public class Parent {
    public static void main(String[] args) {
        System.out.println("\nParent main method called!");
        System.out.println("\nNOTE: main() method gets inherited and if the child class doesn't has a main() method and we run it then the parent class main() method will be called by JVM.");
    }
}

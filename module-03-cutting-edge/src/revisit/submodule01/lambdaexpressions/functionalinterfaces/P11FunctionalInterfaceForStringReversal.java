package revisit.submodule01.lambdaexpressions.functionalinterfaces;

@FunctionalInterface
interface StringReverser {
    String reverse(String str);
}

public class P11FunctionalInterfaceForStringReversal {
    public static void main(String[] args) {
        StringReverser stringReverser = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println("Reversed 'Hello': " + stringReverser.reverse("Hello"));
    }
}

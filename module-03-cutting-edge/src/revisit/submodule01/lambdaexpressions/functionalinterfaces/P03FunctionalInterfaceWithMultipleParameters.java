package revisit.submodule01.lambdaexpressions.functionalinterfaces;

interface StringManipulator {
    String manipulate(String str1, String str2);
}

public class P03FunctionalInterfaceWithMultipleParameters {
    public static void main(String[] args) {
        StringManipulator concat = (s1, s2) -> s1 + s2;
        System.out.println("Concatenated: " + concat.manipulate("Hello, ", "World!"));
    }
}

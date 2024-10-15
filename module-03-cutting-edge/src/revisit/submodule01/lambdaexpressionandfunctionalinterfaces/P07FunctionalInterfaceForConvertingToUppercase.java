package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

@FunctionalInterface
interface UpperCaseConverter {
    String toUpperCase(String str);
}

public class P07FunctionalInterfaceForConvertingToUppercase {
    public static void main(String[] args) {
        UpperCaseConverter upperCaseConverter = (str) -> str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseConverter.toUpperCase("ganesh gupta"));
    }
}

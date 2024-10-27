package revisit.submodule01.lambdaexpressions.functionalinterfaces;

@FunctionalInterface
interface StringComparator {
    int compare(String str1, String str2);
}

public class P12FunctionalInterfaceForStringComparison {
    public static void main(String[] args) {
        StringComparator stringComparator = (s1, s2) -> s1.compareTo(s2);
        System.out.println("Comparison result: " + stringComparator.compare("apple", "banana"));
    }
}

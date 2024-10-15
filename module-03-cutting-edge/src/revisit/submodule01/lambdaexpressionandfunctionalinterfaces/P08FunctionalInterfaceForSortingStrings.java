package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

@FunctionalInterface
interface StringSorter {
    String[] sort(String[] strings);
}

public class P08FunctionalInterfaceForSortingStrings {
    public static void main(String[] args) {
        StringSorter stringSorter = (strings) -> {
            java.util.Arrays.sort(strings);
            return strings;
        };

        String[] names = {"Ganesh", "Virat", "Sheetal"};
        String[] sortedNames = stringSorter.sort(names);
        System.out.println("Sorted Names: " + java.util.Arrays.toString(sortedNames));
    }
}

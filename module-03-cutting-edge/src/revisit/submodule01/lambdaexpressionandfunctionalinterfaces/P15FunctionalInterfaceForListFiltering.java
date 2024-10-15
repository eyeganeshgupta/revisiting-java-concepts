package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface ListFilter {
    List<Integer> filter(List<Integer> numbers);
}

public class P15FunctionalInterfaceForListFiltering {
    public static void main(String[] args) {
        ListFilter evenFilter = (numbers) -> {
            List<Integer> evens = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evens.add(number);
                }
            }
            return evens;
        };

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers: " + evenFilter.filter(numbers));
    }
}

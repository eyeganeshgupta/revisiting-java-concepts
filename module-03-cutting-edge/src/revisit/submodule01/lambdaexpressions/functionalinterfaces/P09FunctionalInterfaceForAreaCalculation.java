package revisit.submodule01.lambdaexpressions.functionalinterfaces;

@FunctionalInterface
interface AreaCalculator {
    double calculateArea(double radius);
}

public class P09FunctionalInterfaceForAreaCalculation {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = (radius) -> Math.PI * radius * radius;
        System.out.println("Area of circle with radius 5: " + areaCalculator.calculateArea(5));
    }
}

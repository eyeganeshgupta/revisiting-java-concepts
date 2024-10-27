package revisit.submodule01.lambdaexpressions.functionalinterfaces;

@FunctionalInterface
interface TemperatureConverter {
    double convert(double celsius);
}

public class P13FunctionalInterfaceForTemperatureConversion {
    public static void main(String[] args) {
        TemperatureConverter toFahrenheit = (celsius) -> (celsius * 9/5) + 32;
        System.out.println("25°C to Fahrenheit: " + toFahrenheit.convert(25));
    }
}

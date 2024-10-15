package revisit.submodule01.lambdaexpressionandfunctionalinterfaces;

@FunctionalInterface
interface Logger {
    void log(String message);
}

public class P16FunctionalInterfaceForCustomLogging {
    public static void main(String[] args) {
        Logger logger = (message) -> System.out.println("Log: " + message);
        logger.log("This is a log message.");
    }
}

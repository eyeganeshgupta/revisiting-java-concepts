package revisit.submodule04.numbersystem;

public class P03ParsingStringsAsDifferentNumberSystems {
    public static void main(String[] args) {
        String binaryString = "1011";
        String octalString = "13";
        String decimalString = "11";
        String hexString = "B";

        int fromBinary = Integer.parseInt(binaryString, 2);
        int fromOctal = Integer.parseInt(octalString, 8);
        int fromDecimal = Integer.parseInt(decimalString, 10);
        int fromHex = Integer.parseInt(hexString, 16);

        System.out.println("\nParsed from Binary: " + fromBinary);   // Output: 11
        System.out.println("Parsed from Octal: " + fromOctal);     // Output: 11
        System.out.println("Parsed from Decimal: " + fromDecimal); // Output: 11
        System.out.println("Parsed from Hexadecimal: " + fromHex); // Output: 11
    }
}

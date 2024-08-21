package revisit.submodule04.numbersystem;

public class P01NumberSystemAllInOne {
    public static void main(String[] args) {
        int decimal = 10;

        // Binary: Binary numbers are represented using the prefix 0b or 0B.
        int binary = 0b1010;
        System.out.println("Binary (0b1010): " + binary);

        // Octal: Octal numbers are represented using the prefix 0.
        int octal = 012;
        System.out.println("Octal (012): " + octal);

        // Decimal: Decimal numbers are the standard numeral system and do not require any prefix.
        System.out.println("Decimal (10): " + decimal);

        // Hexadecimal: Hexadecimal numbers are represented using the prefix 0x or 0X.
        int hexadecimal = 0xA;
        System.out.println("Hexadecimal (0xA): " + hexadecimal);

        // Converting decimal to other systems
        System.out.println("Decimal to Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Decimal to Octal: " + Integer.toOctalString(decimal));
        System.out.println("Decimal to Hexadecimal: " + Integer.toHexString(decimal));
    }
}

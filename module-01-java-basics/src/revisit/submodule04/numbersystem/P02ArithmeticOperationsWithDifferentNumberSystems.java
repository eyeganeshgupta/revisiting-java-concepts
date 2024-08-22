package revisit.submodule04.numbersystem;

public class P02ArithmeticOperationsWithDifferentNumberSystems {
    public static void main(String[] args) {
        int binary1 = 0b1101;   // 13 in decimal
        int binary2 = 0b1010;   // 10 in decimal
        int sumBinary = binary1 + binary2;
        System.out.println("Sum (Binary): " + Integer.toBinaryString(sumBinary)); // Output: 10111

        int octal1 = 017;       // 15 in decimal
        int octal2 = 024;       // 20 in decimal
        int sumOctal = octal1 + octal2;
        System.out.println("Sum (Octal): " + Integer.toOctalString(sumOctal)); // Output: 41

        int hex1 = 0x1A;        // 26 in decimal
        int hex2 = 0x0F;        // 15 in decimal
        int sumHex = hex1 + hex2;
        System.out.println("Sum (Hexadecimal): " + Integer.toHexString(sumHex)); // Output: 29
    }
}

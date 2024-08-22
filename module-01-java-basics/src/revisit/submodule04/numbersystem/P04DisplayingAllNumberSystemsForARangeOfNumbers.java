package revisit.submodule04.numbersystem;

public class P04DisplayingAllNumberSystemsForARangeOfNumbers {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i <= 160; i++) {
            System.out.println("Decimal: " + i +
                    ", Binary: " + Integer.toBinaryString(i) +
                    ", Octal: " + Integer.toOctalString(i) +
                    ", Hexadecimal: " + Integer.toHexString(i));
        }
    }
}

package revisit.submodule01.lambdaexpressions.functionalinterfaces;

interface PalindromeChecker {
    boolean isPalindrome(String str);
}

public class P06FunctionalInterfaceForCheckingPalindrome {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = (str) -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
        System.out.println("Is 'radar' a palindrome? " + palindromeChecker.isPalindrome("radar"));
    }
}

package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P03TokenizationWithMultipleDelimiters {
    public static void main(String[] args) {
        // Create a StringTokenizer with multiple delimiters (comma and space)
        StringTokenizer tokenizer = new StringTokenizer("Java, C++, Python, JavaScript", ", ");

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

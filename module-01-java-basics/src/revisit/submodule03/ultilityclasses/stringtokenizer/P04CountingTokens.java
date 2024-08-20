package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P04CountingTokens {
    public static void main(String[] args) {
        // Create a StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer("One two three four five");

        // Count the number of tokens
        int tokenCount = tokenizer.countTokens();
        System.out.println("Number of tokens: " + tokenCount);

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

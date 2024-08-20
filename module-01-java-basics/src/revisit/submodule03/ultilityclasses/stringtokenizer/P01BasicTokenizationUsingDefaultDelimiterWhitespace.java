package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P01BasicTokenizationUsingDefaultDelimiterWhitespace {
    public static void main(String[] args) {
        // Created a StringTokenizer with the default delimiter (whitespace)
        StringTokenizer tokenizer = new StringTokenizer("Hello World from StringTokenizer");

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

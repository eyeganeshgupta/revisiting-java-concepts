package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P05ReturningDelimitersAsTokens {
    public static void main(String[] args) {
        // Create a StringTokenizer with delimiters included as tokens
        StringTokenizer tokenizer = new StringTokenizer("A-B-C-D-E", "-", true);

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

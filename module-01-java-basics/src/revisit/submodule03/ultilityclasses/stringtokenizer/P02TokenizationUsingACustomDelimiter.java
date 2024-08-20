package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P02TokenizationUsingACustomDelimiter {
    public static void main(String[] args) {
        // Create a StringTokenizer with a comma as the delimiter
        StringTokenizer tokenizer = new StringTokenizer("Apple,Banana,Cherry,Date", ",");

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

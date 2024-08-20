package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.StringTokenizer;

public class P06UsingStringTokenizerWithMultipleCharacterDelimiters {
    public static void main(String[] args) {
        // Create a StringTokenizer with a complex delimiter (space and colon)
        StringTokenizer tokenizer = new StringTokenizer("name: Ganesh age: 21 country: USA", ": ");

        // Iterate through the tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

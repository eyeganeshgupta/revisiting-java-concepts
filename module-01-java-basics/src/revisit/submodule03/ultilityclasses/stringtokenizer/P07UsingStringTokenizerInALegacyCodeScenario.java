package revisit.submodule03.ultilityclasses.stringtokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P07UsingStringTokenizerInALegacyCodeScenario {
    public static void main(String[] args) {
        // Simulate a legacy CSV-like string processing
        String data = "Ganesh,Gupta,21,Engineer";

        // Create a StringTokenizer with comma as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        // Collect tokens into a list
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        // Print the collected tokens
        System.out.println(tokens);
    }
}

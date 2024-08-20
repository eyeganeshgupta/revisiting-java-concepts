package revisit.submodule03.ultilityclasses.locale;

import java.util.Locale;

public class P02UsingLocaleConstants {
    public static void main(String[] args) {
        // Use predefined Locale constants
        Locale localeFR = Locale.FRANCE;

        // Print the display language and country
        System.out.println("Language: " + localeFR.getDisplayLanguage()); // French
        System.out.println("Country: " + localeFR.getDisplayCountry());   // France
    }
}

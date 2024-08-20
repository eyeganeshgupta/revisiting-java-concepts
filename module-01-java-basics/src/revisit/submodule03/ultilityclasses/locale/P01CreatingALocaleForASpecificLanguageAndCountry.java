package revisit.submodule03.ultilityclasses.locale;

import java.util.Locale;

public class P01CreatingALocaleForASpecificLanguageAndCountry {
    public static void main(String[] args) {
        System.out.println("\nThe ‘Locale’ class in Java represents a specific geographical, political, or cultural region. It is used to tailor the program's output to a particular region, such as language, country, and variant.\n");
        // Create a Locale for Hindi in the India
        Locale localeUS = new Locale("hi", "IN");

        // Print the language and country
        System.out.println("Language: " + localeUS.getLanguage()); // hi
        System.out.println("Country: " + localeUS.getCountry());   // IN
    }
}

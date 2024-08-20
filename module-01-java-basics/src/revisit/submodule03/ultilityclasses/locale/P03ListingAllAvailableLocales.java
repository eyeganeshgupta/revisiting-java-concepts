package revisit.submodule03.ultilityclasses.locale;

import java.util.Locale;

public class P03ListingAllAvailableLocales {
    public static void main(String[] args) {
        // Get all available locales
        Locale[] locales = Locale.getAvailableLocales();

        // Print the first 5 available locales
        for (Locale locale : locales) {
            System.out.println("Locale: " + locale.toString() + " - " + locale.getDisplayName());
        }
    }
}

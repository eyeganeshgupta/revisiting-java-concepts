package revisit.submodule03.ultilityclasses.currency;

import java.util.Currency;
import java.util.Locale;

public class P02GettingCurrencyForASpecificLocale {
    public static void main(String[] args) {
        // Get the Currency instance for Germany
        Locale localeDE = Locale.GERMANY;
        Currency currencyEUR = Currency.getInstance(localeDE);

        // Print the currency code, symbol, and display name
        System.out.println("Currency Code: " + currencyEUR.getCurrencyCode());  // EUR
        System.out.println("Currency Symbol: " + currencyEUR.getSymbol());      // €
        System.out.println("Currency Name: " + currencyEUR.getDisplayName());   // Euro
    }
}

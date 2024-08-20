package revisit.submodule03.ultilityclasses.currency;

import java.util.Currency;

public class P01GettingACurrencyInstanceByISO4217Code {
    public static void main(String[] args) {
        System.out.println("\nThe Currency class in Java represents a currency, which is identified by its ISO 4217 currency code. It provides various methods to work with currency information like the symbol, code, and display name.\n");

        // Get the Currency instance for USD (United States Dollar)
        Currency currencyUSD = Currency.getInstance("USD");

        // Print the currency code, symbol, and display name
        System.out.println("Currency Code: " + currencyUSD.getCurrencyCode());  // USD
        System.out.println("Currency Symbol: " + currencyUSD.getSymbol());      // $
        System.out.println("Currency Name: " + currencyUSD.getDisplayName());   // US Dollar
    }
}

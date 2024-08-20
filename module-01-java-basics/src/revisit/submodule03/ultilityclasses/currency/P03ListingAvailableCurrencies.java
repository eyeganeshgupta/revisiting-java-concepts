package revisit.submodule03.ultilityclasses.currency;

import java.util.Currency;
import java.util.Set;

public class P03ListingAvailableCurrencies {
    public static void main(String[] args) {
        // Get the set of available currencies
        Set<Currency> currencies = Currency.getAvailableCurrencies();

        int count = 0;
        for (Currency currency : currencies) {
            System.out.println("Currency Code: " + currency.getCurrencyCode());
            System.out.println("Currency Symbol: " + currency.getSymbol());
            System.out.println("Currency Name: " + currency.getDisplayName());
            System.out.println("--------------------");
        }
    }
}

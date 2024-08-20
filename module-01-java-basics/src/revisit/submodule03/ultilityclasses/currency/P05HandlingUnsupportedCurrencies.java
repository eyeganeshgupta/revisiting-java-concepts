package revisit.submodule03.ultilityclasses.currency;

import java.util.Currency;

public class P05HandlingUnsupportedCurrencies {
    public static void main(String[] args) {
        try {
            // Attempt to get a Currency instance for an unsupported code
            Currency invalidCurrency = Currency.getInstance("XXX"); // Invalid currency code
            System.out.println("Currency: " + invalidCurrency.getCurrencyCode());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Unsupported currency code.");
        }
    }
}

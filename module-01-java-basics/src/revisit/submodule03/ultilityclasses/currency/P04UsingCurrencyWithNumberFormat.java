package revisit.submodule03.ultilityclasses.currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class P04UsingCurrencyWithNumberFormat {
    public static void main(String[] args) {
        // Get a Currency instance for Japan
        Currency currencyJPY = Currency.getInstance("JPY");

        // Create a NumberFormat instance for currency in Japanese locale
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        currencyFormatter.setCurrency(currencyJPY);

        // Format a number as Japanese Yen
        double amount = 1234567.89;
        String formattedAmount = currencyFormatter.format(amount);

        System.out.println("Formatted Amount in JPY: " + formattedAmount);
    }
}

package revisit.submodule03.ultilityclasses.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class P04FormattingDatesAndNumbersWithLocale {
    public static void main(String[] args) {
        // Create a Locale for Germany
        Locale localeDE = Locale.GERMANY;

        // Format the current date in German locale
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, localeDE);
        String date = dateFormat.format(new Date());
        System.out.println("Date in Germany: " + date);

        // Format a number in German locale
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeDE);
        String currency = numberFormat.format(12345.67);
        System.out.println("Currency in Germany: " + currency);
    }
}

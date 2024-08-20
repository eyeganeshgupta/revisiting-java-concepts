package revisit.submodule03.ultilityclasses.calendar;

import java.util.Calendar;

public class MoreOnCalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Using static constants
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Note: January is 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Date: " + day + "/" + (month + 1) + "/" + year);
    }
}

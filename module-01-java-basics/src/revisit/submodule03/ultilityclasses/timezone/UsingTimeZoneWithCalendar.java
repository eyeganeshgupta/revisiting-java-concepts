package revisit.submodule03.ultilityclasses.timezone;

import java.util.Calendar;
import java.util.TimeZone;

public class UsingTimeZoneWithCalendar {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set a specific time zone to the Calendar
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
        calendar.setTimeZone(timeZone);

        // Print the current time in the specified time zone
        System.out.println("Current Time in " + timeZone.getID() + ": " + calendar.getTime());
    }
}

package revisit.submodule03.ultilityclasses.timezone;

import java.util.TimeZone;

public class ListingAllAvailableTimeZones {
    public static void main(String[] args) {
        // Get all available time zone IDs
        String[] timeZones = TimeZone.getAvailableIDs();

        // Print the first 5 time zone IDs
        for (String timeZone : timeZones) {
            System.out.println("Time Zone ID: " + timeZone);
        }
    }
}

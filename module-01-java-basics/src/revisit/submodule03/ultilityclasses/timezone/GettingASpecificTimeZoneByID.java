package revisit.submodule03.ultilityclasses.timezone;

import java.util.TimeZone;

public class GettingASpecificTimeZoneByID {
    public static void main(String[] args) {
        // Get the time zone for a specific ID
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");

        // Print the display name and ID of the time zone
        System.out.println("Time Zone ID: " + timeZone.getID());
        System.out.println("Display Name: " + timeZone.getDisplayName());
    }
}

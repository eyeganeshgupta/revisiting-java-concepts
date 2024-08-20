package revisit.submodule03.ultilityclasses.timezone;

import java.util.TimeZone;

public class GettingTheDefaultTimeZone {
    public static void main(String[] args) {
        // Get the default time zone
        TimeZone defaultTimeZone = TimeZone.getDefault();

        // Print the ID of the default time zone
        System.out.println("Default Time Zone: " + defaultTimeZone.getID());
    }
}

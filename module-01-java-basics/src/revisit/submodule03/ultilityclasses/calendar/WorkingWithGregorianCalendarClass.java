package revisit.submodule03.ultilityclasses.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkingWithGregorianCalendarClass {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current Date and Time: " + calendar.getTime());
    }
}

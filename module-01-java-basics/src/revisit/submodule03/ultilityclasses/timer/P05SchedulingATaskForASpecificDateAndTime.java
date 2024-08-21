package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;

public class P05SchedulingATaskForASpecificDateAndTime {
    public static void main(String[] args) throws Exception {
        // Create a Timer
        Timer timer = new Timer();

        // Specify the date and time for the task to run
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2024-08-20 15:30:00");

        // Schedule a task to run at the specified date and time
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at scheduled time!");
            }
        }, date);

        System.out.println("Task scheduled for: " + date);
    }
}

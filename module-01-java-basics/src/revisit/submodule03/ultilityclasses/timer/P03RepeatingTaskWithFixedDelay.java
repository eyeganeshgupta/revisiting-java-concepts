package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;

public class P03RepeatingTaskWithFixedDelay {
    public static void main(String[] args) {
        // Create a Timer
        Timer timer = new Timer();

        // Schedule a task to run every 2 seconds with a 1-second initial delay
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task with fixed delay executed!");
            }
        }, 1000, 2000);

        System.out.println("Task with fixed delay scheduled. Waiting...");
    }
}

package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;

public class P02RepeatingTaskAtFixedRate {
    public static void main(String[] args) {
        // Create a Timer
        Timer timer = new Timer();

        // Schedule a task to run every 3 seconds, starting after a 1-second delay
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Repeating task executed!");
            }
        }, 1000, 3000);

        System.out.println("Repeating task scheduled. Waiting...");
    }
}

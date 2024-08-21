package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;

public class P04CancelingATimerAndItsTasks {
    public static void main(String[] args) throws InterruptedException {
        // Create a Timer
        Timer timer = new Timer();

        // Schedule a task to run every 1 second
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task running...");
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

        // Let the task run for 5 seconds and then cancel the timer
        Thread.sleep(5000);
        timer.cancel();
        System.out.println("Timer canceled. No more tasks will run.");
    }
}

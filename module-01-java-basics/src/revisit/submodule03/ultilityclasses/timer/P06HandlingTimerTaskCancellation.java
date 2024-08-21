package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;

public class P06HandlingTimerTaskCancellation {
    public static void main(String[] args) throws InterruptedException {
        // Create a Timer
        Timer timer = new Timer();

        // Create a TimerTask that cancels itself after 3 executions
        TimerTask task = new TimerTask() {
            private int counter = 0;

            @Override
            public void run() {
                counter++;
                System.out.println("Task executed: " + counter);
                if (counter >= 3) {
                    this.cancel();
                    System.out.println("Task canceled after 3 executions.");
                }
            }
        };

        // Schedule the task to run every second
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

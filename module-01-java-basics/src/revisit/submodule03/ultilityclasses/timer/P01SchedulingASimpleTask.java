package revisit.submodule03.ultilityclasses.timer;

import java.util.Timer;
import java.util.TimerTask;

public class P01SchedulingASimpleTask {
    public static void main(String[] args) {
        System.out.println("\nThe Timer class in Java is used to schedule tasks for future execution in a background thread. We can schedule a task to run once or to repeat at a regular interval. The tasks to be executed must be instances of a class that implements the TimerTask class.\n");

        // Creating a Timer
        Timer timer = new Timer();

        // Scheduling a task to run after 2 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed!");
            }
        }, 2000);

        System.out.println("Task scheduled. Waiting...");
    }
}

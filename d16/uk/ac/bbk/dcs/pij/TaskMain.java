package uk.ac.bbk.dcs.pij;

import java.util.List;

public class TaskMain {

    private static final int MAX_THREADS = 10;

    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        Thread[] threads = new Thread[MAX_THREADS];
        for (int i = 0; i < MAX_THREADS; i++) {
            System.out.println("Enter the duration (in ms) of task " + i + ": ");
            String input = System.console().readLine();
            int duration = Integer.parseInt(input);
            printTrackerData(tracker);
            Thread t = new Thread(new Task(i, duration, tracker));
            threads[i] = t;
            t.start();
        }
        for (int i = 0; i < MAX_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Who woke me?");
            }
            // printTrackerData(tracker);
        }
        printTrackerData(tracker);
    }

    private static void printTrackerData(TaskTracker tracker) {
        List<Integer> done = tracker.getAndResetTasks();
        if (! done.isEmpty()) {
            // nicer: use a for loop without [] and with , between the task
            // numbers
            System.out.println("Finished tasks: " + done);
        }
    }
}

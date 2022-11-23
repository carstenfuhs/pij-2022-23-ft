package uk.ac.bbk.dcs.pij;

public class Task implements Runnable {

    private int id;
    private int duration;
    private TaskTracker tracker;

    public Task(int id, int duration, TaskTracker tracker) {
        this.id = id;
        this.duration = duration;
        this.tracker = tracker;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(this.duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.tracker.addTask(this.id);
    }
}

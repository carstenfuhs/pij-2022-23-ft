package uk.ac.bbk.dcs.pij;

import java.util.List;
import java.util.ArrayList;

public class TaskTracker {

    private List<Integer> tasks = new ArrayList<>();

    public synchronized void addTask(int id) {
        this.tasks.add(id);
    }

    public synchronized List<Integer> getAndResetTasks() {
        List<Integer> result = this.tasks;
        this.tasks = new ArrayList<>();
        return result;
    }
}

package uk.ac.bbk.dcs.pij;

public class Counter {
    private int n = 0;
    public synchronized void increase() {
        n++;
    }
    public int getCount() {
        return n;
    }
}
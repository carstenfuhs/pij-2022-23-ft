package uk.ac.bbk.dcs.pij;

public class TextLoop3 implements Runnable {
    public static final int COUNT = 10;
    private final String name;
    public TextLoop3(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            sleep();
        }
    }
    private void sleep() {
        try {
            System.out.print("Sleeping for a second");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println("done!");
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
        }
    }
    public static void main(String[] args) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args[0].equals("0")) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop3("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop3("Thread " + i);
                Thread t = new Thread(r);
                t.start();
            }
        }
    }
}

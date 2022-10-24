public class PatientQueueMain {
    public static void main(String[] args) {
        PatientQueue queue = new LinkedPatientQueue();
        Patient p1 = new Patient("A");
        Patient p2 = new Patient("B");
        Patient p3 = new Patient("C");
        queue.insert(p1);
        System.out.println("Inserted " + p1.getName());
        queue.insert(p2);
        System.out.println("Inserted " + p2.getName());
        Patient p = queue.retrieve();
        System.out.println("Retrieved " + p.getName());
        queue.insert(p3);
        System.out.println("Inserted " + p3.getName());
        p = queue.retrieve();
        System.out.println("Retrieved " + p.getName());
        p = queue.retrieve();
        System.out.println("Retrieved " + p.getName());
    }
}

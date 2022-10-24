public class Clinic {
    private PatientQueue queue;
    // ... possibly many more instance variables ...

    public Clinic() {
        queue = new LinkedPatientQueue();
    }

    public Clinic(PatientQueue queue) {
        // "dependency injection", more: Software Design and Programming module
        this.queue = queue;
    }

    public void addPatient(Patient patient) {
        queue.insert(patient);
        // ... further things that need to be done ...
        System.out.println("Added patient: " + p.getName());
    }

    public void treatPatient() {
        Patient p = queue.retrieve();
        // ... code to express treating the patient ...
        System.out.println("Treated patient: " + p.getName());
    }
}

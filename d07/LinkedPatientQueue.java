public class LinkedPatientQueue implements PatientQueue {

    /** Insertion end of the queue. */
    private Patient firstPatient;

    /**
     * Constructs an empty queue.
     */
    public LinkedPatientQueue() {
        firstPatient = null;
    }

    public void insert(Patient patient) {
        // inserts at the beginning of the list
        patient.setNextPatient(firstPatient);
        firstPatient = patient;
    }

    public Patient retrieve() {
        // retrieve from the end of the list
        if (firstPatient == null) {
            return null;
        }
        if (firstPatient.getNextPatient() == null) {
            Patient result = firstPatient;
            firstPatient = null;
            return result;
        }
        Patient current = firstPatient;
        while (current.getNextPatient().getNextPatient() != null) {
            current = current.getNextPatient();
        }
        // A -> B -> C
        // current is now the second-to-last patient (e.g., B)
        Patient result = current.getNextPatient();
        current.setNextPatient(null);
        return result;
    }
}

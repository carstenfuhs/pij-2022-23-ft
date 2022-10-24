// reproducing the code from the reading material
// as a starting point for the demo

/**
 * Manages a list of Patients.
 */
public class HospitalManager {

    private Patient firstPatient = null;

    /**
     * Adds newPatient to the end of the Patient list
     * @param newPatient to be added to the Patient list
     */
    public void add(Patient newPatient) {
        if (firstPatient == null) {
            firstPatient = newPatient;
            return;
        }
        Patient current = firstPatient;
        while (current.getNextPatient() != null) {
            current = current.getNextPatient();
        }
        // at the last Patient
        current.setNextPatient(newPatient);
    }

    /**
     * Deletes Patient with a specific name from the
     * Patient list.
     * @param name the name of the Patient to be deleted
     * @return whether a Patient has actually been found and deleted
     */
    public boolean delete(String name) {
        if (firstPatient == null) {
            return false;
        }
        // use .equals(), not == to compare String
        if (firstPatient.getName().equals(name)) {
            firstPatient = firstPatient.getNextPatient();
            return true;
        }
        Patient current = firstPatient;
        while (current.getNextPatient() != null) {
            if (current.getNextPatient().getName().equals(name)) {
                Patient newNext = current.getNextPatient().getNextPatient();
                current.setNextPatient(newNext);
                //current.setNextPatient(current.getNextPatient().getNextPatient());
                return true;
            }
            current = current.getNextPatient();
        }
        return false;
    }

    public void print() {
        System.out.println("The following patients are in the hospital:");
        if (firstPatient == null) {
            return;
        }
        Patient current = firstPatient;
        while (current != null) {
            System.out.println(current.getName());
            current = current.getNextPatient();
        }
    }

    public int length() {
        if (firstPatient == null) {
            return 0;
        }
        Patient current = firstPatient;
        int result = 0;
        while (current != null) {
            result++;
            current = current.getNextPatient();
        }
        return result;
    }
}
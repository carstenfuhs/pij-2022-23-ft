// reproducing the code from the reading material
// as a starting point for the demo

public class Patient {
    private String name;
    // ... further member variables ...
    private Patient nextPatient;
    private Patient previousPatient;

    public Patient(String name) {
        this.name = name;
        this.nextPatient = null;
        this.previousPatient = null;
    }

    public String getName() {
        return name;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    public void setNextPatient(Patient nextPatient) {
        this.nextPatient = nextPatient;
    }

    public Patient getPreviousPatient() {
        return previousPatient;
    }

    public void setPreviousPatient(Patient previousPatient) {
        this.previousPatient = previousPatient;
    }
}

// reproducing the code from the reading material
// as a starting point for the demo

public class Patient {
    private String name;
    // ... further member variables ...
    private Patient nextPatient;

    public Patient(String name) {
        this.name = name;
        this.nextPatient = null;
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
}

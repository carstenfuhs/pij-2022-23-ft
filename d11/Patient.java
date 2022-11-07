import java.time.Year;

public class Patient {

    private static final MAX_AGE = 130;

    private String name;
    private int year;

    public Patient(String name, int year)
        throws IllegalArgumentException {
        // "throws" declaration optional for RuntimeExceptions

        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        if (age < 0) {
            throw new IllegalArgumentException("Year with non-negative age expected, found " + year);
        }
        if (age > MAX_AGE) {
            throw new IllegalArgumentException("Year with age at most " + MAX_AGE + " expected, found: " + year);
        }
        this.name = name;
        this.year = year;
    }

    // TO DO: add class HospitalManager with a List<Patient> as member variable
    //        and actually read data of patients
}

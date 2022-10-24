// we will need a class for the main method
// for the demo
public class HospitalMain {
    public static void main(String[] args) {
        HospitalManager hm = new HospitalManager();
        Patient[] patients = {
            new Patient("A"),
            new Patient("B"),
            new Patient("C"),
            new Patient("D")
        };

        //hm.add(patient[0]);
        //hm.add(patient[1]);

        for (int i = 0; i < patients.length; i++) {
            hm.add(patients[i]);
        }

        hm.delete("A");

        hm.delete("D");
        // print all Patients in the hospital
        hm.print();
        System.out.println("Length: " + hm.length());
        //hm.print();
    }
}
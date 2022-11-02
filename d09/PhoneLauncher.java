// from Ex 1 for the demo at 4:00pm
/**
 * Driver/Launcher/Main class for the Phone exercises.
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        MobilePhone phone = new SmartPhone("ACME");
        ((SmartPhone)phone).browseWeb("https://www.bbk.ac.uk/");
        System.out.println("Position: " + ((SmartPhone)phone).findPosition());
        phone.ringAlarm("wake up time");
        phone.playGame("Tetris");
        phone.call("123");
        phone.call("00123");
        phone.printLastNumbers();
        testPhone(phone);
        MobilePhone m = new MobilePhone("ACME");
        testPhone(m);
    }

    public void testPhone(Phone p) {
        p.call("1234");
        if (p instanceof SmartPhone) {
            // cast only if it will succeed
            SmartPhone s = (SmartPhone) p;
            s.printLastNumbers();
            s.browseWeb("http://localhost/");
        }
    }
        
}
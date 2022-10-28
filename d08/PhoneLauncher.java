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
        SmartPhone phone = new SmartPhone("ACME");
        phone.browseWeb("https://www.bbk.ac.uk/");
        System.out.println("Position: " + phone.findPosition());
        phone.ringAlarm("wake up time");
        phone.playGame("Tetris");
        phone.call("123");
        phone.call("00123");
        phone.printLastNumbers();
    }
}
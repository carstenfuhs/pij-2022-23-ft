public class MobilePhone extends OldPhone {

    /** Stores the most recently called numbers, oldest number at index 0. */
    private String[] lastNumbers = new String[10];

    /** The next index where to put a phone number. */
    private int nextIndex = 0;

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String text) {
        System.out.println("Alarm time! " + text);
    }

    // Ex 4.1
    //private void playGame(String game) {
    public void playGame(String game) {
        System.out.println("Playing game " + game + "...");
    }

    @Override
    public void call(String number) {
        saveNumber(number);
        super.call(number);
    }

    // public for Ex 2 - international calls should be saved, too
    //private void saveNumber(String number) {
    public void saveNumber(String number) {
        if (nextIndex < lastNumbers.length) {
            lastNumbers[nextIndex] = number;
            nextIndex++;
            return;
        }
        // lastNumbers is full
        // shift all entries of lastNumber down from i+1 to i
        for (int i = 0; i < lastNumbers.length - 1; i++) {
            lastNumbers[i] = lastNumbers[i+1];
        }
        // now it is safe to put the new number to the end of the array
        lastNumbers[lastNumbers.length-1] = number;
    }

    public void printLastNumbers() {
        System.out.println("Last numbers called (latest first):");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.println(lastNumbers[i]);
        }
    }
}

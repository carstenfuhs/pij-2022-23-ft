public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String url) {
        System.out.println("Visiting URL: " + url);
    }

    public String findPosition() {
        return "Here!";
    }

    @Override
    public void call(String number) {
        if (number.substring(0,2).equals("00")) {
            // Does *not* write to the call log!
            // => separate out write access to the call log.
            saveNumber(number);
            System.out.println("Calling " + number + " through the Internet to save money");
        } else {
            super.call(number);
        }
    }
/*
    public void playGame(String game) {
        System.out.println("Playing game " + game + " on the Smartphone ...");
    }
*/

    // equals(Object)?
    // No need, inherit the implementation from MobilePhone!
}

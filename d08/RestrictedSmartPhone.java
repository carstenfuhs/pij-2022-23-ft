public class RestrictedSmartPhone extends SmartPhone {

    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

//    private void playGame(String game) {
//    }
// DOES NOT WORK!

    @Override
    public void playGame(String game) {
        System.out.println("No games on this phone!");  
    }
}
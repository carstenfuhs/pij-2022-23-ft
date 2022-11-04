// towards the demo!
public class PairMain {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 2022);
        Pair<String, Integer> pair2 = new Pair<>(pair1);
        System.out.println("first: " + pair1.getFirst());
        System.out.println("second: " + pair1.getSecond());
        Pair<Integer, String> pair3 = pair2.swap();
        System.out.println("first: " + pair3.getFirst());
        System.out.println("second: " + pair3.getSecond());

        // ex 2
        OldPhone oldPhone = new OldPhone("ACME");
        Pair<OldPhone, Integer> pair4 = new Pair<>(oldPhone, 8);
        Pair<Phone, Integer> pair5 = new Pair<>(pair4);


        
    }

    // experimental
    public static void doSomething(Map<Object, Phone> myMap) {
        Phone p = myMap.get("ABCD");
        Phone p2 = myMap.get(3256);
    }
}
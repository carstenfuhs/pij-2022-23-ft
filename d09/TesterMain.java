public class TesterMain {

    //public boolean equals(TesterMain other) {
    // ... would NOT override public boolean equals(Object) from Object!

    @Override
    public boolean equals(Object other) {
       return true; // stub implementation
    }

    public static void main(String[] args) {
        OldPhone old = new OldPhone("ACME classic");
        MobilePhone mobile = new MobilePhone("ACME");
        OldPhone mobileAsOld = mobile; // implicit upcast

        SimpleTester simple = new SimpleTester();
        SpecialTester special = new SpecialTester();
        SimpleTester specialAsSimple = special; // implicit upcast

        simple.test(old); // simple test old
        simple.test(mobile); // simple test old
        simple.test(mobileAsOld); // simple test old
        System.out.println();
        special.test(old); // special test old
        special.test(mobile); // special test mobile
        special.test(mobileAsOld); // special test old
        System.out.println();
        specialAsSimple.test(old); // special test old
        specialAsSimple.test(mobile); // special test old
        specialAsSimple.test(mobileAsOld); // special test old
        System.out.println();
        simple.ring(old); // simple ring old
        simple.ring(mobile); // simple ring old
        simple.ring(mobileAsOld); // simple ring old
        System.out.println();
        special.ring(old); // simple ring old
        special.ring(mobile); // special ring mobile
        special.ring(mobileAsOld); // simple ring old
        System.out.println();
        specialAsSimple.ring(old); // simple ring old
        specialAsSimple.ring(mobile); // simple ring old
        specialAsSimple.ring(mobileAsOld); // simple ring old
    }
}


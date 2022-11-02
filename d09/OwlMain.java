public class OwlMain {
    public static void main(String[] args) {
        Bird b = new Bird();
        Owl o = new Owl();
        Bird owlAsBird = o;

        Bird.print();
        Owl.print();

        b.print();
        o.print();
        owlAsBird.print();
    }
}

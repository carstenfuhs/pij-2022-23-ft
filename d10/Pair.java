public class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    //public Pair(Pair<A, B> pairToCopy) {
    public Pair(Pair<? extends A, ? extends B> pairToCopy) {
        this(pairToCopy.first, pairToCopy.second);
        //this.first = pairToCopy.first;
        //this.second = pairToCopy.second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public Pair<B, A> swap() {
        // for (42, "Foo") return ("Foo", 42)
        return new Pair<>(second, first);
    }

}

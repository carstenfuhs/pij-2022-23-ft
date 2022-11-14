public class Bottles {

    public static void printBottlesLyrics(int n) {
        if (n <= 0) { // base case
            System.out.println("There are NO green bottles on the wall!");
            return;
        }
        // recursive case
        // - do something "locally" to make a step towards
        //   the solution
        System.out.println(n + " green bottles on the wall."
           + " If one should accidentally fall:");
        // - recursive call with a "smaller" argument
        printBottlesLyrics(n-1);
    }

    public static void main(String[] args) {
        printBottlesLyrics(10);
    }
}
public class Buggy {
    public static String buggyMethod(int n) {
        if (n <= 0) { // make base case "broader" (it was n == 0)
            return "";
        }
        return n + " " + buggyMethod(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(buggyMethod(11));
    }
}

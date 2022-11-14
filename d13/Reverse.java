public class Reverse {

    public static String reverse(String input) { 
        //System.out.println("reverse(" + input + ") called!");
        if (input.length() <= 1) { // base case
            return input;
        }
        // recursive case (complex input)
        char first = input.charAt(0); // split off first character
        String rest = input.substring(1); // smaller input

        // recursive call on smaller input
        String restReversed = reverse(rest);

        // combine result for smaller input with char 'first'
        // (it should go to the end)
        String result = restReversed + first;
        //System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        String word = "abcdefg";
        System.out.println("Word:          " + word);
        System.out.println("Word reversed: " + reverse(word));
    }
}

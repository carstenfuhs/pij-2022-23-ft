public class PalindromeDriver {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Is " + input + " a palindrome?");
        System.out.println("Iterative answer: " + Palindrome.isPalindromeLoop(input));
        System.out.println("Recursive answer: " + Palindrome.isPalindrome(input));
    }
}

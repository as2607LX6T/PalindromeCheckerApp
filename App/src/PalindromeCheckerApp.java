import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize the string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array
        char[] chars = normalized.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        if (checker.checkPalindrome(input))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");

        sc.close();
    }
}

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer technique
        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("is Palindrome? true");
        } else {
            System.out.println("is Palindrome? false");
        }

        sc.close();
    }
}

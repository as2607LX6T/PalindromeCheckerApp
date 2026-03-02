import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Text: ");
        String input = sc.nextLine();

        String original = input;
        String reverse = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Check palindrome
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println("It is a Palindrome? : true");
        } else {
            System.out.println("It is NOT a Palindrome? : false");
        }

        sc.close();
    }
}

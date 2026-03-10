public class PalindromeCheckerApp {

    // Method 1: Reverse using loop
    public static boolean isPalindromeReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Two pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using StringBuilder reverse
    public static boolean isPalindromeStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String test = "madamimadam";

        // Reverse Method
        long start1 = System.nanoTime();
        isPalindromeReverse(test);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Two Pointer Method
        long start2 = System.nanoTime();
        isPalindromeTwoPointer(test);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // StringBuilder Method
        long start3 = System.nanoTime();
        isPalindromeStringBuilder(test);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display results
        System.out.println("Execution Time Comparison (nanoseconds):");
        System.out.println("Reverse Method: " + time1);
        System.out.println("Two Pointer Method: " + time2);
        System.out.println("StringBuilder Method: " + time3);
    }
}
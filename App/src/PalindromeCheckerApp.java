import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter text to check: ");
        String input = scanner.nextLine();

        // Check if palindrome (case-insensitive)
        String processedInput = input.replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase
        boolean isPalindrome = true;
        int length = processedInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (processedInput.charAt(i) != processedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
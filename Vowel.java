import java.util.Scanner;

public class VowelCounter {

    // Method to count the number of vowels in a string
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase(); // Convert to lowercase for easier comparison

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Count vowels using the method
        int vowelCount = countVowels(userInput);

        // Display the result
        System.out.println("Number of vowels: " + vowelCount);
    }
}

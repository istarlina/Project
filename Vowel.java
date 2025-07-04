import java.util.Scanner;

public class VowelCounter {

    
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase(); 

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

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        int vowelCount = countVowels(userInput);

        System.out.println("Number of vowels: " + vowelCount);
    }
}

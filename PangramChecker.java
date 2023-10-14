import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to make it case-insensitive
        input = input.toLowerCase();
        
        // Here we store the unique letters in the input
        Set<Character> letterSet = new HashSet<>();
        
        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Checking alphabet is between 'a' and 'z'
            if (c >= 'a' && c <= 'z') {
                letterSet.add(c); // Adding the letter to the set
            }
        }
        
        // Checking the set contains all 26 letters
        return letterSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine(); //we use here scanner class method .
        sc.close();

        if (isPangram(input)) 
        {
            System.out.println("Entered sentence is pangram."); //here we printing output
        } 
        else 
        {
            System.out.println("Entered sentence is not a pangram.");
        }
    }
}

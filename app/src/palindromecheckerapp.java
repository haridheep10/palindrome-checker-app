import java.util.Scanner;

public class PalindromeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String str = sc.nextLine();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Check palindrome
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }

        sc.close();
    }
}
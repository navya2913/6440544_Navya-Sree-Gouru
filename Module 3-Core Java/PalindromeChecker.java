public class PalindromeChecker {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleaned = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}

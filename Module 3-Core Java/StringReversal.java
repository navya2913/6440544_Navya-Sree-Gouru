public class StringReversal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String reversed = new StringBuilder(input).reverse().toString();

        
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

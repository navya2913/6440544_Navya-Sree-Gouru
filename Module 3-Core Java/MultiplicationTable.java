public class MultiplicationTable {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

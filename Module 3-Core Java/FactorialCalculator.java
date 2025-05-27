public class FactorialCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

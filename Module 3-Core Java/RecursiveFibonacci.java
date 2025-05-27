public class RecursiveFibonacci {
    
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        scanner.close();
    }
}

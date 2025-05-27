public class EvenOddChecker {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}

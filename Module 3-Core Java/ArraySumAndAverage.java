public class ArraySumAndAverage {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}

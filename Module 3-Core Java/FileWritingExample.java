public class FileWritingExample {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String input = scanner.nextLine();

        try {
            java.io.FileWriter writer = new java.io.FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data has been written to output.txt");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        scanner.close();
    }
}

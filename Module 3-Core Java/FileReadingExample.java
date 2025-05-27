public class FileReadingExample {
    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("output.txt");
            java.util.Scanner reader = new java.util.Scanner(file);

            System.out.println("Contents of output.txt:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

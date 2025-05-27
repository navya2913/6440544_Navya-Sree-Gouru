public class ArrayListExample {
    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("How many student names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("\nStudent Names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

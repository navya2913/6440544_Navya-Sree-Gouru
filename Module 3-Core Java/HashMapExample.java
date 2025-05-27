public class HashMapExample {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> studentMap = new java.util.HashMap<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("How many student entries do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID (integer): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("\nEnter a student ID to retrieve the name: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}

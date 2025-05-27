public class LambdaSortExample {
    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<>();
        
        // Add some sample names
        names.add("Zara");
        names.add("Mohan");
        names.add("Amit");
        names.add("Riya");
        names.add("John");
        
        System.out.println("Before sorting:");
        for (String name : names) {
            System.out.println(name);
        }
        
        
        java.util.Collections.sort(names, (a, b) -> a.compareTo(b));
        
        System.out.println("\nAfter sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

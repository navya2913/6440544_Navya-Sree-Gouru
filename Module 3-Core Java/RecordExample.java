public class RecordExample {
    
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 30);
        Person p4 = new Person("Diana", 15);

    
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

     
        java.util.List<Person> people = java.util.Arrays.asList(p1, p2, p3, p4);

     
        java.util.List<Person> adults = people.stream()
            .filter(person -> person.age() >= 18)
            .toList(); 

        System.out.println("\nAdults (age >= 18):");
        for (Person adult : adults) {
            System.out.println(adult);
        }
    }
}

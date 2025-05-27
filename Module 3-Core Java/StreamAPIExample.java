public class StreamAPIExample {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(10, 15, 20, 25, 30, 35, 40);

       
        java.util.List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .toList();  

        System.out.println("Even numbers:");
        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }
}

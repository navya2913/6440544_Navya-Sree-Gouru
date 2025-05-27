public class MethodOverloadingExample {
    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        
        int sum1 = add(5, 10);               
        double sum2 = add(3.5, 2.8);         
        int sum3 = add(1, 2, 3);             

        
        System.out.println("Sum of 5 and 10 (int): " + sum1);
        System.out.println("Sum of 3.5 and 2.8 (double): " + sum2);
        System.out.println("Sum of 1, 2, and 3 (int): " + sum3);
    }
}

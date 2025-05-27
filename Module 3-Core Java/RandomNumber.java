import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 to 100");
        int guessNumber=sc.nextInt();
        System.out.print("System Generated number:");
        int randnum= rand.nextInt(100)+1;
        System.out.println(randnum);
        
        if(randnum>guessNumber){
            System.out.println("You guessed the number too LOW");
        }
        else if(randnum<guessNumber){
            System.out.println("You guessed the number too HIGH");
        }
        else{
            System.out.println("Congratulations you Guessed Correct");
        }
    }
}

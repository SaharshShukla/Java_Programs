package basicJavaPrograms;
import java.util.Scanner;

public class factorialOfNumberByIterativeWay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
    static int fact(int num){
        int product = 1;
        for( int i = num; i >= 1; i--){//int i = 1; i <= num; i++
            product = product * i;
        }
        return product;
    }
}

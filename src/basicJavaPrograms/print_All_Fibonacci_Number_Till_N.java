package basicJavaPrograms;
import java.util.Scanner;

public class print_All_Fibonacci_Number_Till_N {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numOne = 0 , numTwo = 1;
        System.out.print("Enter range : ");
        int n =scn.nextInt();

        System.out.println("Fibonacci seris till "+ n + " is " );
        for( int i = 0;i <= n;i++ ){
            System.out.print(numOne + " ");
            int numThree = numOne + numTwo;
            numOne = numTwo;
            numTwo = numThree;
        }
    }
}

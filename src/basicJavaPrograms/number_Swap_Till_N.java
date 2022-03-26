package basicJavaPrograms;
import java.util.Scanner;

public class number_Swap_Till_N {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne = scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo = scn.nextInt();
        System.out.println("Enter Range: ");
        int range = scn.nextInt();
        System.out.println("Number before swapping");
        System.out.println("Number one is  " + numOne + " Number two is " + numTwo);
        for( int i = 0; i <= range; i++){
            numOne = numOne + numTwo;
            numTwo = numOne - numTwo;
            numOne = numOne - numTwo;
        }
        System.out.println("Number after swapping");
        System.out.println("Number one is " + numOne + "Number two is " + numTwo);
    }
}

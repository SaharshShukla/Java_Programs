package basicJavaPrograms;
import java.util.Scanner;

public class print_Digit_Of_A_Number {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =scn.nextInt();
        int tmp =num;
        int noOfDigit = 0;
        while(tmp != 0){
            tmp = tmp /10;
            noOfDigit++;
        }

        int div = (int ) Math.pow( 10, noOfDigit - 1 );
        System.out.println("Digit of " + num + " is ");
        while( div != 0){
            int qst = num / div;
            System.out.print(qst + " ");
            num = num  % div;
            div = div / 10;
        }
    }
}

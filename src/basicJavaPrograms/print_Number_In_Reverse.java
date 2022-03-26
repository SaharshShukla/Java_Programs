package basicJavaPrograms;
import java.util.Scanner;

public class print_Number_In_Reverse {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter  a number : ");
        int num = scn.nextInt();
        int tmp = num ;
        int noOfDigit = 0;
        while(num != 0){
            noOfDigit = num % 10;
            num = num / 10;
            //System.out.print(" Digit of entered  number is " );
            System.out.print( noOfDigit + " ");
        }


    }
}

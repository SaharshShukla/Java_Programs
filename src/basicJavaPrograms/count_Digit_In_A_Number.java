package basicJavaPrograms;
import java.util.Scanner;
public class count_Digit_In_A_Number {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scn.nextInt();
        int tmp = num;
        int noOfDigit = 0;

        while( num != 0){

            num = num /10;
            noOfDigit ++;
        }
        System.out.print("Number of digit in "+ tmp + " is "+ noOfDigit);
    }
}

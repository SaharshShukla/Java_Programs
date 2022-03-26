package basicJavaPrograms;
import java.util.Scanner;

public class print_Sum_Of_Even_Digit_And_Odd_Digit_In_A_Number {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =  scn.nextInt();
        int evn = 0, odd = 0 , rem = 0;
        while( num != 0 ){
            rem = num % 10;
            if( rem % 2 == 0 ){
                evn =  evn + rem;
            }else{
                odd = odd + rem;
            }
            System.out.println("Even number is " + evn + " " + " Odd number is " + odd);
        }

    }
}

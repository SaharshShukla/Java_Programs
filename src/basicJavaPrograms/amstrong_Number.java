package basicJavaPrograms;
import java.util.Scanner;
public class amstrong_Number {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        int tmpOne = num, tmpTwo = num , rem = 0, noOfDigit = 0 , arm = 0;

        while(tmpOne != 0){
            tmpOne = tmpOne /10;
            noOfDigit++;
        }
        while(tmpTwo != 0){
            int product = 1;
            rem = tmpTwo /10;
            for( int i = 1; i <= noOfDigit; i++){
                product = rem * product;
            }
            arm += product;
            tmpTwo = tmpTwo / 10;
        }
        if(num == arm){
            System.out.println("number is a armstrong number");
        }else{
            System.out.println("number is not a armstrong number");
        }
    }
}

package basicJavaPrograms;
import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args){
        Scanner scn = new  Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scn.nextInt();
        System.out.println("Sum of digit is " + sumOfDigitOfNumber(num) );
    }
    static int sumOfDigitOfNumber(int num ){
        int sum = 0;
        while( num  != 0){
            int digit = num % 10;
            num = num / 10;
            sum += digit;
        }
        return sum;
    }
}

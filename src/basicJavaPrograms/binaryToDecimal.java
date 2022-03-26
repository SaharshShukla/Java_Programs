package basicJavaPrograms;
import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int binary = scn.nextInt();
        deci( binary );
    }
    static void deci(int binary ){
        int decimal = 0, i = 0, tmp = binary ;//i is power of 2
        while(tmp > 0){
             int rem = tmp % 10;
            tmp = tmp / 10;
            decimal = decimal + rem * ((int)Math.pow(2 , i++));
        }
        System.out.println("Binary to  decimal  is : " + decimal);
    }
}

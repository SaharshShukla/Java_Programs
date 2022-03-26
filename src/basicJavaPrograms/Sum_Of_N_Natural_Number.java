package basicJavaPrograms;
import java.util.Scanner;
public class Sum_Of_N_Natural_Number {
    public static void main(String[] args){
        //Method One
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int n = scn.nextInt();
        int sum = n * ( n + 1) / 2;
        System.out .println(" Sum of  n Natural Number is :  " + sum);
        sumOfNaturalNumber(n);
    }

    //Method two
    static void sumOfNaturalNumber( int n){
        int sum = 0;

        for( int i = 1; i <= n; i++){
            sum += i;
            System.out .println(" Sum of  n Natural Number is :  " + sum);
        }

        System.out .println("ToatalSum of " + n + " Natural Number is :  " + sum);
    }
}

package basicJavaPrograms;
import java.util.Scanner;
public class prime_Factorization_Till_N {
    public static void main(String[] args){

        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        for( int div = 2; div * div <= num; div++ ){
            while( num % div == 0){
                num = num /div;
                System.out.print( div + " ");
            }
        }

        if( num != 1){
            System.out.println(num + " ");
        }
    }
}

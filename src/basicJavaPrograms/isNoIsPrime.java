//Check is Number is prime
package basicJavaPrograms;
import java.util.Scanner;
public class isNoIsPrime {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        System.out.print("Enter range: ");
        int rang = scn.nextInt();
        for( int i = 0; i <  rang; i++ ){
            int count = 0;
            for(int div = 2; div * div <= num ;div++){

                if( num % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is not prime");
            }
        }


    }
}

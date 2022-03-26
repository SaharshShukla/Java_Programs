package basicJavaPrograms;
import java.util.Scanner;
public class print_All_PrimeNumber_Till_N {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter low number: ");
        int low = scn.nextInt();
        System.out.print("Enter high number: ");
        int high = scn.nextInt();

        for( int num = low; num <= high; num++){
            int count = 0;
            for( int div = 2; div * div <= num ; div++){
                if( num % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("Prime number between "+ low + " and " +high + " is "+num);
            }
        }
    }
}

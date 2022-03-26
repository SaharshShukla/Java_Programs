package basicJavaPrograms;
import java.util.Scanner;
public class nth_Fibonnaci_Number_By_Recursion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scn.nextInt();
        int rslt = fibo( num );
        System.out.println( rslt );
    }
     static int fibo( int num ){
        //base case
        if( num == 1){
            return 1;
        }
        return ( fibo( num - 1 ) + fibo( num - 2 ));
    }
}

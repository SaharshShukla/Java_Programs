package basicJavaPrograms;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int deci = scn.nextInt();
        binary( deci );
    }
    static void binary( int deci  ){
        int[] arr = new int[8];
        int rem , i = 0; //i is index of arrary
        while(deci > 0){
            rem = deci % 2;
            deci = deci / 2;
            arr[i] = rem;
            i++;
        }
        System.out.println("Decimal to binary is : ");
        for( int k = arr.length - 1; k >= 0; k--){
            System.out.print( arr[k] + " ");
        }
    }
}

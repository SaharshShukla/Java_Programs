package basicJavaPrograms;
import java.util.Scanner;

public class verify_Pythagorean_Triplets {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scn.nextInt();
        System.out.print("Enter number b: ");
        int b = scn.nextInt();
        System.out.print("Enter number c: ");
        int c = scn.nextInt();

        int max = a;

        if( b >= max){
            max = b;
        }
        if( c >= max ){
            max = c;
        }

        if( a == max ){
            boolean flag = (( b * b + c * c) == (a * a ) );
            System.out.println(flag);
        }else if( b == max ){
            boolean flag = (( a * a + c * c ) == ( b * b) );
            System.out.println(flag);
        }else{
            boolean flag = (( a * a + b * b) == ( c * c) );
            System.out.println(flag);
        }
    }
}

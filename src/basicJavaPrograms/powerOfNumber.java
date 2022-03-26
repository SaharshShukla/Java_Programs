package basicJavaPrograms;
import java.util.Scanner;
public class powerOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scn.nextInt();
        System.out.println("Enter power of  number : ");
        int pow = scn.nextInt();
        System.out.println(" Power Of Number Is :  " + power( num, pow));
    }
    static int power( int num, int pow ){
        int mul = 1;
        for( int i = 1;i <= pow ; i++){
            mul = mul * num;
        }
        return mul;
    }
}

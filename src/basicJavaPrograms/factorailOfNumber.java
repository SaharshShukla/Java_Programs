package basicJavaPrograms;
import java.util.Scanner;
public class factorailOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Factorial of number is " + fact(num));
    }
    static int fact(int num){
        //base conditon
        if(num == 1){
            return 1;
        }
        return fact(num -1) * num;
    }
}

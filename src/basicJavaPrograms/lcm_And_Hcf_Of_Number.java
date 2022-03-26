package basicJavaPrograms;
import java.util.Scanner;

public class lcm_And_Hcf_Of_Number {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo = scn.nextInt();
        int orgNumOne = numOne , orgNumTwo = numTwo;

        while( numOne % numTwo != 0){

            int rem = numOne % numTwo;
            numOne = numTwo;
            numTwo = rem;
        }

        int hcf = numTwo;
        int lcm = (orgNumOne * orgNumTwo ) / hcf;
        System.out.println("lcm of " + orgNumOne + " and " + orgNumTwo + " is " + lcm);
        System.out.println("hcf of " + orgNumOne + " and " + orgNumTwo + " is " + hcf);
    }
}

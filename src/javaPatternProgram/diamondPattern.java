package javaPatternProgram;

public class diamondPattern {
    public static void main(String[] args){
        int n = 5;
        //upper part of diamond
        for( int i = 1; i <= n; i++){
            //innner loop print space add two spaces for printing the upper part
            for( int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for( int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //lower part of diamond
        for( int i = n - 1; i >=1; i-- ){
            //inner loop print space add one spaces for printing the upper part
            for( int  j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for( int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

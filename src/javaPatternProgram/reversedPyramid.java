package javaPatternProgram;

public class reversedPyramid {
    public static void main(String[] args){
        int n = 5;
        for( int i = n; i >= 1; i-- ){
            //inner loop print spaces
            for( int j = 1; j <= n - i ; j++ ){
                System.out.print(" ");
            }
            for( int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
o/p
 *  *  *  *  *
  *  *  *  *
   *  *  *
    *  *
     *

*/
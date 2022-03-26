package javaPatternProgram;

public class reversedPyramidWithNUmberPatternOne {
    public static void main(String[] args){
        int n = 5;
        for( int i = n; i >= 1; i-- ){
            //inner loop print spaces
            for( int j = 1; j <= n - i ; j++ ){
                System.out.print(" ");
            }
            int count = 1;
            for( int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
/*
o/p
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

 */
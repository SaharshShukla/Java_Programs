package twoDimensionalArrays;

public class oddEvenFrequencyInMatrix {
    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 6, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        frq(arr);
    }
    static void frq(int[][]arr){
        int row = arr.length;
        int col = arr[0].length;
        int evnCnt = 0;
        int oddCnt = 0;
        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(arr[i][j] % 2 == 0){
                    System.out.println("Even element is " + arr[i][j] + " ");
                    evnCnt++;
                }else if(arr[i][j] % 2 != 0){
                    System.out.println("Odd element is " +arr[i][j] + " ");
                    oddCnt++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Even element count is " + evnCnt + " Odd element count is " + oddCnt);
    }
}

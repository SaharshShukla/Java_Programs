package twoDimensionalArrays;

public class spiralInMatrix {
    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 6, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        int row = arr.length;
        int col = arr[0].length;
        spiral(arr, row , col);
    }
    static void spiral(int[][] arr, int row , int col){
        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;
        int noOfEle = row * col;
        int cnt = 0;

        while(cnt < noOfEle){
            for( int i = minRow,j = minCol; i <= maxRow && cnt < noOfEle ; i++){
                System.out.print(arr[i][j] + " --> ");
                cnt++;
            }
            minCol++;

            for( int i = maxRow,j = minCol; j <= maxCol && cnt < noOfEle ; j++){
                System.out.print(arr[i][j] + " --> ");
                cnt++;
            }
            maxRow--;

            for( int i = maxRow,j = maxCol; i >= minRow && cnt < noOfEle ; i--){
                System.out.print(arr[i][j] + " --> ");
                cnt++;
            }
            maxCol--;

            for( int i = minRow,j = maxCol; j >= minCol && cnt < noOfEle ; j--){
                System.out.print(arr[i][j] + " --> ");
                cnt++;
            }
            minRow++;
        }
    }
}

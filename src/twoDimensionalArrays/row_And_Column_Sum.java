package twoDimensionalArrays;

public class row_And_Column_Sum {
    static void rowSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int totalSum = 0;// total row sum
        for( int i = 0; i < row; i++){
            int sum = 0;// row wise sum
            for( int j = 0; j < col; j++){
                totalSum += arr[i][j];
                sum += arr[i][j];
            }
            System.out.println("Row sum is " + sum);
        }
        System.out.println("Total row sum is " + totalSum);

    }

    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 4, 3},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}};
        rowSum(arr);
        colSum(arr);
    }

    static void colSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int totalSum = 0;// total col sum
        for( int j = 0; j < col; j++){
            int sum = 0;// col wise sum
            for( int i = 0; i < row; i++){
                totalSum += arr[i][j];
                sum += arr[i][j];
            }
            System.out.println("Column sum is " + sum);
        }
        System.out.println("Total column sum is " + totalSum);
    }
}

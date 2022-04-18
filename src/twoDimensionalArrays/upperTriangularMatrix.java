package twoDimensionalArrays;

public class upperTriangularMatrix {
    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 6, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        upperMatrix(arr);
    }
    static void upperMatrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(i > j){
                    System.out.print("0" + " ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

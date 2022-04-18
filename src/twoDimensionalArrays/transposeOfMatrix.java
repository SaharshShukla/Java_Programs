package twoDimensionalArrays;

public class transposeOfMatrix {
    public static void main(String[] args){
        int[][] arr = {
                 { 1, 2, 3, 4},
                 { 5, 6, 7, 8}
        };

        transpose(arr);
    }
    static void transpose(int[][] arr){
        int  row = arr.length;
        int col = arr[0].length;
        int newRow = col;
        int newCol = row;
        int[][] newMat = new int[newRow][newCol];

        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                newMat[j][i] = arr[i][j];
            }
        }

        System.out.println("Printing transpose of the matrix");
        for( int i = 0; i < newRow; i++){
            for( int j = 0; j < newCol; j++){
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }


    }





}

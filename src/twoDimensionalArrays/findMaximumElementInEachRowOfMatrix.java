package twoDimensionalArrays;

public class findMaximumElementInEachRowOfMatrix {

    static void maxElement(int[][] arr){
        int row  = arr.length;
        int col = arr[0].length;

        for( int i = 0; i < row; i++){
            int max = arr[0][0];
            for( int j = 0; j < col; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    System.out.println(" max  element is " + max + " row " + i  );
                }

            }
        }

    }

    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 6, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        maxElement(arr);
    }
}

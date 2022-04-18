package twoDimensionalArrays;

public class rotateMatrixBy90Degree {
    static void transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int newRow = col;
        int newCol = row;
        int[][] newMat = new int[newRow][newCol];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMat[j][i] = arr[i][j];
            }
        }
        //to rotate matrix by 90 degree
        for (int i = 0; i < newRow; i++) {
            reverse(newMat[i]);
        }

        System.out.println("Printing 90 degree rotated  matrix");
        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        int[][] arr = {
            { 1, 2, 6, 4},
            { 5, 6, 7, 8},
            { 9, 10, 11, 12},
            { 13, 14, 15, 16}
        };
        transpose(arr);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while( start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}

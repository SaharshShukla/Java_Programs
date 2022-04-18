package twoDimensionalArrays;

public class spareMatrix {
    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 6, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        mat(arr);
    }
    static void mat(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int size = row * col;
        int cnt = 0;
        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(arr[i][j] == 0){
                    cnt ++;
                }
            }
        }

        if(size / 2 < cnt){
            System.out.print("Spare matrix");
        }else{
            System.out.print("Not a spare matrix");
        }
    }
}

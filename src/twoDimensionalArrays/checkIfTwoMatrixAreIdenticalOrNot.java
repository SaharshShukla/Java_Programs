package twoDimensionalArrays;

public class checkIfTwoMatrixAreIdenticalOrNot {

    static boolean check(int[][] arrOne, int[][] arrTwo){
        int row = arrOne.length;
        int col = arrOne[0].length;
        boolean flag = true;

        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if( arrOne[i][j] != arrTwo[i][j]){
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        int[][] arrOne = {{ 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12},{ 13, 14, 15, 16}};
        int[][] arrTwo = {{ 1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12},{ 13, 14, 15, 16}};

       boolean rslt = check(arrOne, arrTwo);

       if(rslt == true){
           System.out.print("Both Matrix is identical");
       }else{
           System.out.print("Both Matrix are not identical");
       }
    }
}

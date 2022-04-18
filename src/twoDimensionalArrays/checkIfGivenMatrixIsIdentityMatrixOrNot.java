package twoDimensionalArrays;

public class checkIfGivenMatrixIsIdentityMatrixOrNot {

    static boolean checkIdentityMatrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean flag = true;
        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(i == j && arr[i][j] != 1){
                    flag = false;
                    break;
                }else if(i != j && arr[i][j] != 0){
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
        int[][] arr = { { 1, 0, 0, 0}, { 0, 1, 0, 0}, { 0, 0, 0, 0}, { 0, 0, 0, 1}};
        boolean result = checkIdentityMatrix(arr);
        if(result == true){
            System.out.print("Given matrix is identity matrix");
        }else{
            System.out.print("Given matrix is not identity matrix");
        }
    }
}

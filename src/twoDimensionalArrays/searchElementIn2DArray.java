package twoDimensionalArrays;

public class searchElementIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
                { 10, 20, 30},
                { 40, 50, 60},
                { 70, 80, 90}
        };
        int target = 40;
        boolean fnd = found(arr,target);
        if(fnd == true){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

    }
    static boolean found(int[][] arr, int target){
        boolean flag = false;

        int row = arr.length;
        int col = arr[0].length;

        for( int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(arr[i][j] == target){
                    System.out.println("Element found at the index " + i + " " + j);
                    flag = true;

                }
            }

        }
        return flag;
    }
}

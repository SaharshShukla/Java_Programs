package twoDimensionalArrays;

public class sumOfFirstDiagonalAndSumOfSecondDiagonal {
    static void secondDiagonalSum(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;
        System.out.println("Second diagonal is: ");
        for( int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if((i + j) == ( row - 1)){
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("Second diagonal sum is : " + sum);
    }

    public static void main(String[] args){
        int[][] arr = {{ 10, 5, 2},{ 8, 3, 12},{ 20, 6, 18}};
        firstDiagonalSum(arr);
       secondDiagonalSum(arr);
    }
    static void firstDiagonalSum(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;
        System.out.println("First diagonal is: ");
        for( int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("First diagonal sum is : " + sum);
    }
}

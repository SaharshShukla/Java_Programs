package twoDimensionalArrays;

public class printFirstDiagonalAndSecondDiagonalOfMatrix {
    static void secondDiagonal(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("Second diagonal is: ");
        for( int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if((i + j) == (row - 1)){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int[][] arr = {{ 10, 5, 2},{ 8, 3, 12},{ 20, 6, 18}};
        firstDiagonal(arr);
        secondDiagonal(arr);
    }
    static void firstDiagonal(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;
        System.out.println("First diagonal is: ");
        for( int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

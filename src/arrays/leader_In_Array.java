package arrays;

public class leader_In_Array {
    public static void main(String[] args){
        int[] arr = {17, 16, 3, 2, 6, 1};
        leader(arr);
    }
    static void leader(int[] arr){
        for( int i = 0; i < arr.length; i++){
            int j;
            for( j = i + 1; j < arr.length; j++){
                if(arr[i] <= arr[j]){
                    break;
                }
            }

            if(arr.length == j){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

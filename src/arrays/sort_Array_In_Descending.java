package arrays;

public class sort_Array_In_Descending {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 7, 1};
        sort(arr);
    }
    static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j;
            for( j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Sorted array in descending is ");
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

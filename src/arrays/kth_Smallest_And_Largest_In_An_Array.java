package arrays;

public class kth_Smallest_And_Largest_In_An_Array {
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        kthElement(arr,k);
    }
    static void kthElement(int[] arr, int k){
        for( int i = 0; i < arr.length - 1;i++){
            int j;
            for( j = i+ 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            if(i == k - 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
/*
Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10
 */
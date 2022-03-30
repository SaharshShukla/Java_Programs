package arrays;

public class swapping_Of_The_Array_And_Printing_It_In_Reverse {
    public static void main(String[] args){
        int arr[] = { 1, 2, 3, 4, 5};
        reverse(arr);
    }
    static void reverse(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(start < end ){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        System.out.println("reversed arr is ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

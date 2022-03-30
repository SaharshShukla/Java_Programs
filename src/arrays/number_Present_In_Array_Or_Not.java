package arrays;

public class number_Present_In_Array_Or_Not {
    public static void main(String[] args){
        int[] arr = { 12, 15, 18, 19 , 20};
        int target = 15;
        isPresent(arr,target);
    }
    static void isPresent(int[] arr, int target){
        int index = -1;
        boolean flag = false;
        for( int i = 0; i < arr.length; i++){
            if( arr[i] == target){
                index = i;
                flag = true;
            }
        }
        System.out.println("Is target present is the given array : " + flag  + "\n Index of target element is : " + index );
    }
}

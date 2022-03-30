package arrays;

public class check_Number_Present_In_Array_And_Give_Its_Last_Occurrence {
    public static void main(String[] args){
        int[] arr = { 12, 5, 18, 19, 15, 20, 15};
        lastOccurrence(arr, 15);
    }
    static void lastOccurrence(int[] arr, int target){
        int index = -1;
        boolean flag = false;
        for( int i =0; i < arr.length; i++){
            if( arr[i] == target){
                index = i;
                flag = true;
            }
        }
        System.out.println("Is target present in the given array : " + flag);
        System.out.println(" last occurrence of  element is " + (index + 1) );
    }

}

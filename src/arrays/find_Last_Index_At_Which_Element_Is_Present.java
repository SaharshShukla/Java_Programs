package arrays;

public class find_Last_Index_At_Which_Element_Is_Present {
    public static void main(String[] args){
        int[] arr = { 12, 123, 24, 51, 15, 18, 19 , 10, 15};
        int target = 15;
        lastIndexOfArray(arr, target);
    }
    static void lastIndexOfArray(int[] arr, int target){
        int index = -1;
        boolean flag = false;
        for(int  i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                flag = true;
            }
        }
        System.out.println("Is element present in the array: " + flag);
        System.out.println("Last index of the array is: " + index);
    }
}

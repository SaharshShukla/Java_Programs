package arrays;

public class check_Number_Present_In_An_Array_Or_Not_And_Give_Its_First_Occurrence {
    public static void main(String[] args){
        int[] arr = { 12, 15, 18, 15, 20};
        occurrence(arr, 15);
    }
    static void occurrence(int[] arr, int target){
        int index = -1;
        boolean flag = false;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] == target ){
                index = i;
                flag = true;
                break;
            }
        }
        System.out.println("Is element present in the array : " + flag);
        System.out.println("First Occurrence of the element in the array is : " + ( index  + 1 ));//indx + 1 or real world position
    }

}

package arrays;

public class firstIndexOfArray {
    public static void main(String[] args){
        int[] arr = { 12, 123, 34, 51, 15, 18, 19, 10, 15};
        int target = 15;
        idx(arr, target);
    }
    static void idx(int[] arr, int target){
        int index = -1;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                flag = true;
                break;
            }
        }
        System.out.println("Is element found : " + flag);
        System.out.println("Is element first  index is  : " + index);

    }
}

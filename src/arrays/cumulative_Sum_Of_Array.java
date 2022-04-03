package arrays;

public class cumulative_Sum_Of_Array {
    public static void main(String[] args){
          int[] arr = {9, 8, 7, 0, -2, 5};
          int[] rslt = cumulativeSumOfArray(arr);
          System.out.println("Cumulative sum of arrays is : ");
          for( int i = 0; i < arr.length; i++){
              System.out.print(arr[i] + " ");
          }
    }
    static int[] cumulativeSumOfArray(int[] arr){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            arr[i] = sum + arr[i];
        }
        return arr;
    }
}
/*
Array = {9, 8, 7, 0, -2, 5}
Cumulative sum = [9, 17, 24, 24, 22, 27]
 */
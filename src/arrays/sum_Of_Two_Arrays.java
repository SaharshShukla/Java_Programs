package arrays;

public class sum_Of_Two_Arrays {
    public static void main(String[] args){
        int[] arrOne = {3, 1, 0, 7, 5};
        int[] arrTwo = {1, 1, 1, 1, 1, 1};
        sumOfTwo(arrOne,arrTwo);
    }
    static void sumOfTwo(int[] arrOne, int[] arrTwo){
        int[] sum = new int[arrOne.length > arrTwo.length? arrOne.length : arrTwo.length];
        int  i = arrOne.length - 1;
        int  j = arrTwo.length - 1;
        int  k = sum.length - 1;
        int carry = 0;
        while(k >= 0){
            int digit = carry;
            if(i >= 0){
                digit +=arrOne[i];
            }
            if(j >= 0){
                digit += arrTwo[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            sum[k] = digit;
            i--;
            j--;
            k--;
        }
        if(carry != 0){
            System.out.print(carry);
        }
        for(int obj : sum){
            System.out.print(obj + " ");
        }
    }
}

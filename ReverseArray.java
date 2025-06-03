import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));;
        isreverse(arr);
        System.out.println(Arrays.toString(arr));;
    }

    static void isreverse(int[] arr){
        int start =0;
        int end =arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];;
            arr[end] = temp;
            start++;
            end--;

        }

    }
}

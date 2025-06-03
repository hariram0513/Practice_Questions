import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr ={1, 3,6,7,2,0};
        System.out.println(Arrays.toString(isarr(arr)));
    }

    static int[] isarr(int[] arr){

            int temp =arr[0];
            for(int i=1;i<arr.length;i++){

                if(temp < arr[i]){
                    temp =arr[i];
                }

            }


        return new int[]{temp};
    }
}

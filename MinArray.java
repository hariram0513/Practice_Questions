public class MinArray {
    public static void main(String[] args) {
        int[] arr ={1, 3, 4, 8, 9, -4, 45};
        System.out.println(minvalue(arr));;

    }

    static int minvalue(int[] arr){
        int min =arr[0];

        for(int i =1;i<arr.length;i++){
            if (arr[i] < min){
                min =arr[i];
            }
        }
        return min;

    }
}

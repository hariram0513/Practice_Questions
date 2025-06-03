public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,13,15,22,34,43,55};
        int target =34;

        System.out.println(isbinary(arr,target));;
    }

    static int isbinary(int[] arr, int target){
        int start =0;
        int end =arr.length -1;


        while (start <= end){
            int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }else if(target < arr[mid]){
            end =mid -1;
        }else {
            start = mid + 1;
        }

    }
        return -1;
    }
}

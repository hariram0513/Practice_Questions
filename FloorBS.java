
// it was retuning the largest number smaller or equalto target

public class FloorBS {
    public static void main(String[] args) {

        int[] arr ={1, 3, 5, 8, 9, 15, 18, 35, 32};
        int target =14;

        System.out.println(isceling(arr, target));;

    }

    static int isceling(int[] arr, int target){

        int start =0;
        int end =arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return arr[mid];
            }

            if(target > arr[mid]){
                start = mid + 1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return end % arr.length;
    }
}

public class BSAseDse {
    public static void main(String[] args) {
       // int[] arr = {1,5,7,9,13,15,22,34,43,55};
        int[] arr ={55, 43, 34, 22, 15, 13, 9, 7, 5, 1};
        int target =34;

        System.out.println(isBS(arr, target));;
    }

    static int isBS(int[] arr, int target){

        int start =0;
        int end =arr.length -1;
        boolean Ase = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(Ase) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}

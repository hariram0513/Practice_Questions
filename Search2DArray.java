public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr ={{1, 3},
                {88, 65, 887},
                {778, 55, 21, 89}};

        int target = 55;

        System.out.println(linearsearch(arr,target));;


    }

    static int linearsearch(int[][] arr, int target){
        for(int i =0; i<arr.length; i++){
            for(int j= 0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    return target;
                }
            }
        }
        return -1;
    }
}

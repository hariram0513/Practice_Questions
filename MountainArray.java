public class MountainArray {
    public static void main(String[] args) {
        int[] mountainArry  = {1,2,3,4,5,3,1};
        int target = 3;
        int start =0;
        int end = mountainArry.length -1;
        int peak =search(mountainArry, start, end);
        int firsttry = search1(mountainArry, start, peak, target);
        if (firsttry != -1) {
            System.out.println(firsttry);
        }else{
            System.out.println(search2(mountainArry,end, peak, target));
        }

    }

    static int search(int[] mountainArry, int start, int end){
        while(start < end){
            int mid = start + (end - start)/2;
            if(mountainArry[mid] < mountainArry[mid + 1]){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int search1(int[] mountainArry, int start, int peak, int target){
        while(start < peak){
            int mid = start +(peak - start)/2;
            if(mountainArry[mid] == target){
                return mid;
            }else if(mountainArry[mid] < target){
                start = mid+1;
            }else{
                peak = mid-1;
            }

        }
        return -1;
    }

    static int search2(int[] mountainArry, int end, int peak, int target){
        while(peak < end){
            int mid = peak +(end - peak)/2;
            if(mountainArry[mid] == target){
                return mid;
            }else if(mountainArry[mid] > target){
                peak = mid+1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }


    }

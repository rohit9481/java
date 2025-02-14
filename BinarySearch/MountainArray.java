public class MountainArray {
//leetcode 1095
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,3,1};
        int target =3;
    }
    int search(int[] arr,int target){
        int peek=findInMountain(arr);
        int firstTry= orderAgnostic(arr,target,0,peek);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peek+1,arr.length-1);
    }

    static int orderAgnostic(int[] arr, int target,int start,int end){
        start = 0;
        end = arr.length -1;
        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int findInMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid=start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){//u r at descending order
                end = mid;

            }else{
                //u r in ascending order
                start=mid+1;
            }
        }
        return start;
    }

}

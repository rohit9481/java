public class PeakIndexMountainArray {
    //Peak Index in a Mountain Array (852)
    public static void main(String[]args){

    }
    static public int peakIndexInMountainArray(int[] arr) {
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
        return start;//return start or end bec bec of above checks array will be reducing everytime and both start and end point at same inder at end
    }
}

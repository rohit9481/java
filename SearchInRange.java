public class SearchInRange {
    public static void main(String[]args){
        int[] arr={18,12,-7,3,48,20};
        int target = 3;
        System.out.println(linersearch(arr,target,0,2));

    }
    static int linersearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            // System.out.print("fals");
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int elements = arr[index];
            if (elements == target) {
                return index;//true
            }

        }
        return -1;//false
    }
}

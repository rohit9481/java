public class min_max_rec {
    public static void main(String[]args){
        int[] arr={10,5,20,8,3,25};
        int n= arr.length;
        int min = findmin(arr,n,0);
        int max = findmax(arr,n,0);
        System.out.println("minimun"+ min);
        System.out.println("maximum"+max);
    }
    static int findmin(int[]arr, int n, int index){
        if(index == n-1){
            return arr[index];
        }
        return Math.min(arr[index],findmin(arr,n,index+1));
    }
    public static int findmax(int[] arr, int n, int index) {
        if (index == n - 1) {
            return arr[index]; // Base case: only one element left
        }
        return Math.max(arr[index], findmax(arr, n, index + 1));
    }
}

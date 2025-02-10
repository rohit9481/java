public class Min {
    public static void main(String[]args){
        int[] arr ={12,32,43,12,34,5,64,30,-2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}

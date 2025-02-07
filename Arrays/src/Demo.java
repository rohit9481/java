public class Demo {
    public static void main(String[]args){
        int[] arr={1,2,113, 4,45,6,74,43,132};
        System.out.println(maxRange(arr, 3,7));

    }

    static int maxRange(int[]  arr,int start, int end){
        if(arr ==null){
            return -1;
        }
        if(arr.length ==0){
            return -1;
        }
        int max=arr[0];
        if(arr[0]==0){
            System.out.println("enter valid no.");
        }
        for(int i = start; i<end; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
}

import java.util.Arrays;

public class majorityElements {
    public static void main(String[]args){
        int[] arr={3,1,5,4,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex= getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr, int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}


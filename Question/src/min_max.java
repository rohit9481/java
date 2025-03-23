// Recursive Java program to find minimum
import java.util.*;

public class min_max {
    public static void main(String[]args){
        int[] arr={4,2,1,5,3,-4,0,10};
        int min= arr[0];
        int max = arr[0];
         for(int i=1;i<arr.length;i++){
             if(min > arr[i]){
                 min = arr[i];
             }
             if(max < arr[i]){
                 max=arr[i];
             }
         }
         System.out.println(min);
         System.out.println(max);

    }
}


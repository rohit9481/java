public class BS {
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,32,43,45,457};
        System.out.println(search(arr,7,0,arr.length-1));
    }

    static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m= s+(e-s)/2;
        if(arr[m]== target){
            return m;
        }
        if(target < arr[m]){
            return search(arr,target,s,e= m-1);
        }
        return search(arr,target,s=m+1,e);
    }
}

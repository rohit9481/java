import java.util.Arrays;
class missing {
    public static void main(String[]args){
        int[] arr={4,0,2,1};
        System.out.println(missingnumber(arr));
    }
    static int missingnumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];{
                if(arr[i]<arr.length && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
        }
        //search first missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        //case2
        return arr.length;
    }
    static void swap(int[] arr, int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }


}
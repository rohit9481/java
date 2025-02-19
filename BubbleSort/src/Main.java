import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapend;
        for(int i=0;i<arr.length;i++){
            swapend=false;// if array is already sorted then this will run and goes directly to the last command and break
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];//2
                    arr[j] = arr[j-1];//2==1
                    arr[j-1]=temp;//1==2
                    swapend= true;
                }
            }
            if(!swapend){// !false = true
                break;
            }
        }
    }
}
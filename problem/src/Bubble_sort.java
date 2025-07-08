import java.util.*;
public class Bubble_sort {
    static void bubbleSort(int arr[]){
        int size = arr.length;

        for(int i=0; i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                }
            }
        }
    }
    static void swap(int arr[],int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of arr: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter "+ size + "elements:");
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//       arr = new int[]{10, 20, 30, 40, 50}; // if we didn't give input values , arrays will be assigned has 0 initially
//        System.out.println(arr[2]);
//        String [] arr1 = new String[3];

//         int[] arr5 = {12,23,4,45}; // direct
//        System.out.print(Arrays.toString(arr5));
//        System.out.println(arr1[1]);
//        int[] arr = new int[5];
//        arr = new int[]{23,43,54,65,45};
//        System.out.print(Arrays.toString(arr));
//        for (int i = 0; i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.print(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i]+" ");
        }


//        for (int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
}
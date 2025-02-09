import java.util.Arrays;                                                             //        Scanner in = new Scanner(System.in);
import java.util.Scanner;                                                            //        int[][] arr = new int[3][3];
                                                                                     //        System.out.print(arr.length);
public class TwoDArrays {                                                            //        //input
    public static void main(String []args){                                          //        for (int row = 0; row<arr.length;row++){
//        // string are mutable                                                      //            for(int col = 0;col <arr[row].length;col++){
//         int[] num = {2,3,4,5,6};                                                  //                arr[row][col] = in.nextInt();
//         System.out.println(Arrays.toString(num));                                 //            }
//         change(num);                                                              //        }
//         System.out.print(Arrays.toString(num));
//    }                                                                                      // first method to print
//    static void change(int[] arr){                                                 //        for (int row = 0;row <arr.length;row++){
//        arr[1] = 99;                                                               //            for (int col =0; col<arr[row].length;col++){
//        arr[0] = 10;                                                               //                System.out.print(arr[row][col]);
//    }                                                                              //            }
        //2D array                                                                   //            System.out.println();
        int [][] arr2d = {                                                           //        }
                {1, 2, 3,4},
                {5, 6},                                                                      // 2nd method
                {8, 9, 10}                                                           //        for(int row = 0; row<arr.length;row++){
        };                                                                           //            System.out.println(Arrays.toString(arr[row]));
//        for (int row =0;row<arr2d.length;row++){              //1 2 3 4            //        }// output: [1, 2, 3]
//            for (int col=0;col<arr2d[row].length;col++){    //  5 6                //        //          [4, 5, 6]
//                System.out.print(arr2d[row][col]+" ");      //  8 9 10             //        //          [7, 8, 9]
//            }
//            System.out.println();                                                  //        //other method with enhance array
//        }                                                                          //        for (int[] row : arr){
                                                                                     //            System.out.println(Arrays.toString(row));
        // another way                                                               //        }
//        for(int row=0;row<arr2d.length;row++){
//            System.out.println(Arrays.toString(arr2d[row]));                           };
//        }                                                                          }

//        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        System.out.print(arr.length);
//        //input
//        for (int row = 0; row<arr.length;row++){
//            for(int col = 0;col <arr[row].length;col++){
//                arr[row][col] = in.nextInt();
//            }
//        }

        // first method to print
//        for (int row = 0;row <arr.length;row++){
//            for (int col =0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }

        // 2nd method
//        for(int row = 0; row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }// output: [1, 2, 3]
//        //          [4, 5, 6]
//        //          [7, 8, 9]

//        //other method with enhance array
//        for (int[] row : arr){
//            System.out.println(Arrays.toString(row));
//        }

    };
}

import java.util.Arrays;
// leetcode 240
public class rowcol2d {
    public static void main(String[]args){
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,6)));
    }
    static int[] search(int[][]matrix,int target){
         int row=0;
         int col= matrix.length-1;
         while(row < matrix.length && col>=0){
             if(matrix[row][col] == target){
                 return new int[]{row,col};
             }if(matrix[row][col]<target){
                 row++;
             }else{
                 col--;
             }
         }
         return new int[]{-1,-1};
    }
}
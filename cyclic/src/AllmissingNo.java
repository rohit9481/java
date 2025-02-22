import java.util.ArrayList;
import java.util.List;

class AllmissingNo {
    public static void main(String[]args){
        int[] nums={4,0,2,6,1};
        System.out.println(missing(nums));
    }
    static List<Integer> missing(int[]nums) {
        int i = 0;//index
        while (i < nums.length) {
            int correct = nums[i]-1;//value
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[]nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}

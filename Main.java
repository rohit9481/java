//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 43, 54, 2134, 1, 22, -11, 28};
        int target = 1;
        int ans = linersearch(nums, target);
        //boolean ans = linersearch(nums, target);
        System.out.println(ans);
    }
    // static boolean linersearch(int[] arr, int target) {
    static int linersearch(int[] arr, int target) {
        if (arr.length == 0) {
           // System.out.print("fals");
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int elements = arr[index];
            if (elements == target) {
                return index;//true
            }
        }
        return -1;//false
    }
}

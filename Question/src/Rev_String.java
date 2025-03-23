import java.util.Arrays;

public class Rev_String {
        public void reverseString(char[]s){
            Helper(s,0,s.length-1);
        }
        private void Helper(char[] s, int left, int right){
            if(left > right){
                return;

            }
            char temp= s[left];
            s[left] = s[right];
            s[right] = temp;
            Helper(s,left+1,right-1);

        }
        public static void main(String[]args){
           char[] s = {'h','e','l','l','o'};
            Rev_String Rev_String = new Rev_String();
            Rev_String.reverseString(s);
            System.out.println(Arrays.toString(s));
    }
/* class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right= s.length-1;
        while(left<right){
            char temp= s[left];
            s[left] = s[right];
            s[right] = temp;
        left++;
        right--;
        }
    }
} */
}

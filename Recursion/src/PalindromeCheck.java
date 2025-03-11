public class PalindromeCheck {
    static int reverseHelper(int n, int sum){
        if(n == 0){
            return sum;
        }
        int rem = n %10;
        return reverseHelper(n / 10, sum * 10+rem);
    }
    static boolean ispalindrome(int n){
        return n == reverseHelper(n,0);
    }
    public static void main(String[]args){
        int n = 1234321;
        //System.out.println(reverseHelper(n,0));
        if(ispalindrome(n)){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("is Not a palindrome");
        }
    }
}

import java.util.Scanner;
public class odd_even {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int odd_even= fun_odd_even(n);
    }
    public static int fun_odd_even(int n){
        if (n % 2 == 0){
            System.out.print("even");
        }
        else {
            System.out.print("odd");
        }
        return n;
    }
}

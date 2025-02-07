import java.util.Scanner;
public class sum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first: ");
        int first = in.nextInt();
        System.out.print("enter second: ");
        int second = in.nextInt();
        int sum = int_sum(first,second);
        int product = int_sum(first,second);
        System.out.println(sum+product);

    }
    public static int int_sum(int first, int second){
        int sum= first + second;
        int product = first * second;
        return sum;
    }

}

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int n){
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n % c == 0){
                return false;
            }
            c++ ;
        }
        return true;

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        int num3= in.nextInt();

        int max = num1;
        if(num2> max){
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println(max);

    }
}
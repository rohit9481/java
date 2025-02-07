//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b=1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b=b+a;
            a= temp;
            count++;
        }
        System.out.println(b);
    }
}
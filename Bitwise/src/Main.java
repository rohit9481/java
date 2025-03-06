//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* 100101(0) even
1001010(1) odd
just checking LSB
 */
public class Main {
    public static void main(String[] args) {
        int n=68;
        System.out.println(odd(n));
    }
    static boolean odd(int n){
        return (n & 1)==1;
    }
}
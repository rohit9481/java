//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        patters1(5);
        System.out.println("........................................");
        patters2(4);
        System.out.println("........................................");

        patters3(4);

    }
    static void patters1(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void patters2(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void patters3(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
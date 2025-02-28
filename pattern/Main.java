//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        patters1(5);
//        System.out.println("........................................");
//        patters2(4);
//        System.out.println("........................................");

        patters4(5);

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
    static void patters4(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }

    }
    static void patters5(int n){
        for(int row=0;row<2*n;row++){
            int totalcolForRow = row > n ? 2 *n - row: row;
            for(int col = 0; col < totalcolForRow; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

}
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mounth: ");
        int mounth = scan.nextInt();

        switch(mounth){

            case 'A':
                System.out.println("Jan");

            case 2:
                System.out.println("Feb");

            case 3:
                System.out.println("Mar");
                break;

            case 4:
                System.out.println("Apri");
        }
    }
}

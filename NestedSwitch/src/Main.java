//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int EmpID = in.nextInt();
        String Dept = in.next();
//        switch(EmpID){
//            case 1 : System.out.println("rohit");
//            break;
//            case 2 : System.out.println("rahul");
//            break;
//            case 3 :
//                switch (Dept){
//                    case "it" : System.out.println("from it dept");
//                    break;
//                    case "management": System.out.println("from management");
//                    break;
//                    default:System.out.println("enter valid dept");
//                }
//            break;
//            default:System.out.println("enter valid emp");
//        }
        switch (EmpID) {
            case 1 -> System.out.println("rohit");
            case 2 -> System.out.println("rahul");
            case 3 -> {
                switch (Dept) {
                    case "it":
                        System.out.println("from it dept");
                        break;
                    case "management":
                        System.out.println("from management");
                        break;
                    default:
                        System.out.println("enter valid dept");
                }
            }
            default -> System.out.println("enter valid emp");
        }

    }
}
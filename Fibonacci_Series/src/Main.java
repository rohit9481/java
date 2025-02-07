//import javax.swing.plaf.synth.SynthOptionPaneUI;
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the first no.: ");
//        float first = in.nextFloat();
//
//        System.out.println("Enter the operator(+,-,*,/): ");
//        char operator = in.next().charAt(0);
//
//        System.out.println("Enter the Second no.: ");
//        float second = in.nextFloat();
//
//        System.out.println("your no is: " + first +operator+second);
//
//        if(operator == '+'){
//            System.out.println("total sum is: " +(first + second));
//        } else if (operator == '-') {
//                System.out.println("difference is: " + (first - second));
//
//        } else if (operator == '*') {
//            System.out.println("Mul is: " + (first * second));
//
//        }
//        else if(operator == '/'){
//            System.out.println("difference is: " + (first / second));
//        }
//        else{
//            System.out.println("invalid operator");
//        }
//
//
//
//    }
//}

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the no.: ");
        double first = in.nextDouble();

        System.out.print("enter the no.: ");
        double second = in.nextDouble();

        if(first > second){
            System.out.println(first + " number is big ");
        }
        else{
            System.out.println(second + " number is big");
        }

    }
}
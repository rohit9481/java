import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        float principle = in.nextFloat();


        System.out.print("Enter the Time: ");
        float time = in.nextFloat();


        System.out.print("Enter the rate: ");
        float rate = in.nextFloat();

        float intarest = (principle*time*rate)/100;
        System.out.println("The sample interest: "+intarest);

        in.close();

    }
}
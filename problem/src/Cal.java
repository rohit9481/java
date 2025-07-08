import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        float num1;
        float num2;
        System.out.println("Enter 1st no: ");

        Scanner scaner = new Scanner(System.in);
        num1 = scaner.nextFloat();

        System.out.println("Enter 2nd no: ");
        num2 = scaner.nextFloat();

        System.out.println("Your entered numbers are: "+num1 +" & "+num2);

        String options = "Enter 1 for addition, Enter 2 for multiplication, Enter 3 for devision";
        System.out.println(options);
        int value= scaner.nextInt();

            switch (value) {

                case 1:
                    System.out.println("addition:" + num1 + num2);
                    break;

                case 2:
                    System.out.println("mul:" + num1 * num2);
                    break;

                case 3:
                    System.out.println("dev:" + num1 / num2);
                    break;

                default:
                    System.out.println("please Enter valid numbers");
            }

    }
}


//url in java
//import java.net.URL;
//public class URL{
//    public static void main(String[] args) {
//        URL obj = new URL("https://learn.knowledgegate.ai/learn/home/Java-for-MPH/section/368617/lesson/2281179?");
//
//
//        System.out.println(obj.getport );
//    }
//}


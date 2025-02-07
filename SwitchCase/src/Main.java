//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "Mango" -> System.out.println("fruit in the king");
            case "Apple" -> System.out.println("Fruit is Red");
            case "banana" -> System.out.println("Fruit is yellow");
            case "graps" -> System.out.println("Fruit is small");
            default -> System.out.println("give valid fruit");
        }

//        int day = in.nextInt();
//        switch(day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//        }

//        switch (fruits){
//            case "Mango":
//                System.out.println("fruit in the king");
//                break;
//            case "Apple":
//                System.out.println("Fruit is Red");
//                break;
//            case "banana":
//                System.out.println("Fruit is yellow");
//                break;
//            case "graps":
//                System.out.println("Fruit is small");
//                break;
//            default:
//                System.out.println("give valid fruit");
//        }
//
}}
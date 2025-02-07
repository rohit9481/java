
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the world: ");
        String original = in.nextLine();

        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equalsIgnoreCase(reverse)){
            System.out.println("world is palindrome");
        }
        else{
            System.out.println("world is not palindrome");

        }
    }
}
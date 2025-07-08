import java.util.*;
public class validString {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int char1=0, char2 = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                char1++;
            }
            else if(str.charAt(i)=='*'){
                char2++;
            }
            else{
                System.out.println("invalid");
                break;
            }
        }
        int result= char1-char2;
        if(result == 0){
            System.out.println("Balanced");
        }
        else if(char1>char2){
            System.out.println("increase *");
        }
        else
        System.out.println("increase #");
    }

}

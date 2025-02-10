import java.util.Arrays;

public class Searchstring {
    public static void main(String[]args){
        String name="Rohit";
        char target= 'i';
        System.out.println(Search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int index = 0;index <str.length();index++){
            if(target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}

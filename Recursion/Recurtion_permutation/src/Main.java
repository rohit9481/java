//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //permutations("","abc");
        System.out.println(permutationsCount("", "abc"));
    }
    static void permutations(String result, String original){
        if(original.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch= original.charAt(0);
        for(int i=0; i<=result.length();i++){
            String f = result.substring(0,i);
            String s = result.substring(i, result.length());
            permutations(f+ch+s,original.substring(1));
        }
    }
    static int permutationsCount(String result, String original){
        if(original.isEmpty()){
            System.out.println(result);
            return 1;
        }
        int count = 0;
        char ch= original.charAt(0);
        for(int i=0; i<=result.length();i++){
            String f = result.substring(0,i);
            String s = result.substring(i, result.length());
            count = count + permutationsCount(f+ch+s,original.substring(1));
        }
        return count;
    }
}
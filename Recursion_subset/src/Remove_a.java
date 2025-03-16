//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Remove_a {
    public static void main(String[] args) {
        skip("","bacahanna");
    }
    static void skip(String result, String original){
        if(original.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = original.charAt(0);
        if(ch == 'a'){
            skip(result, original.substring(1));
        }else{
            skip(result+ch, original.substring(1));
        }

    }
}
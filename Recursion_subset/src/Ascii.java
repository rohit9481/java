import java.util.ArrayList;

public class Ascii {
    public static void main(String[]args){
        //just Ascii
        subAscii("","abc");
        //with Array list
        //System.out.println(subAsciiReturn("","abc"));

    }
    static void subAscii(String result,String original){
        if(original.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch = original.charAt(0);
        subAscii(result+ch,original.substring(1));
        subAscii(result,original.substring(1));
        subAscii(result+(ch+0),original.substring(1));
    }

    static ArrayList<String> subAsciiReturn(String result, String original){
        if(original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> first = subAsciiReturn(result+ch,original.substring(1));
        ArrayList<String> second = subAsciiReturn(result,original.substring(1));
        ArrayList<String> third = subAsciiReturn(result+(ch+0),original.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }
}

public class subseq {
    public static void main(String[]args){
        subseq("","abc");
    }
    static void subseq(String result, String original){
        if(original.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = original.charAt(0);
        subseq(result+ch,original.substring(1));
        subseq(result, original.substring(1));


    }
}

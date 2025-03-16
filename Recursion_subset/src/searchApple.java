public class searchApple {
    public static void main(String[] args) {
        System.out.println(skipApple("bancheapplefsa"));
    }
    static String skipApple(String original){
        if(original.isEmpty()){

            return"";
        }
        if(original.startsWith("apple")){
            return skipApple(original.substring(5));
        }else{
            return original.charAt(0) + skipApple(original.substring(1));
        }

    }
}

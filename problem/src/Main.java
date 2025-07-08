import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
       // System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer(30);
        //System.out.println(sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Rohitfyfjfufufyffyfjyfjfffjygy");
        //.out.println(sb2.capacity());


        sb.append("Rohit");
        sb.append(" yakkundi");
//        sb.insert(5," from ");
//        sb.replace(1,4,"HHH");
        String str = sb.toString();
        //System.out.println(str);


        // Generating random car
        int n=4;
        String name = RandomString.generate(n);
        //System.out.println(name);

        //string
        String string = "Hi I AM SELF MADE BILLIONAIRE  ";
        //System.out.println(string);

        //System.out.println(string.replaceAll("\\s",""));

        //string split then showing like arrays
        String arr= "Rohit Kunal Rakesh";
        String[] names= arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off


    }
}
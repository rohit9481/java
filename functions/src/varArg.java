import java.util.Arrays;

public class varArg {
    public static void main(String[]args){
        //multiple(1,3,"Rohan","Shila","efeffefewfewf"); //calling variable Argument
        multiple(32);
    }
    static void multiple(int a,int b, String ...v){ // we can use int ...v
        System.out.print(a+",");
        System.out.print(b+",");
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int c){//method overloading ,
        // it decides at compile level by checking the parameter
        System.out.println(c);
    }

}

class calculater {
    int add(int a, int b){
        return a+b;
    }
    Double add(Double a,Double b){
        return a+b;
    }
    float add(float a,float b,float c){
        return a+b+c;
    }
}
public class overloading {
    public static void main(String[]args){
        calculater obj= new calculater();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2324.4324,324.412));
        System.out.println(obj.add(32,312,2134));
    }
}

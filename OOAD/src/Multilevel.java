class grandpa{
    void house(){
        System.out.println("grandpa house");
    }
}
class father extends grandpa{
    void bike(){
        System.out.println("father's bike");
    }
}
class son extends father{
    void cycle(){
        System.out.println("cycle");
    }
}
public class Multilevel {
    public static void main(String[]args){
        son obj = new son();
        obj.house();
        obj.bike();
        obj.cycle();

    }
}

//reduce complexity, Enhance security, improve code management
abstract class car {
    public abstract void drive();

    public void Music() {
        System.out.println("music");
    }
}
    class wagonR extends car{
        public void drive(){
            System.out.println("driving");
        }
    }
public class Abstraction {
    public static void main(String[]args){
        car obj=new wagonR();
        obj.drive();
        obj.Music();
    }
}

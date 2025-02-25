class animal{
    void makesound(){
        System.out.println("some sound");
    }
}
class dog extends animal{
    void makesound(){
        System.out.println("woof!");
    }
}
public class overriding {
    public static void main(String[]args){
        animal obj=new dog();
        obj.makesound();
    }
}

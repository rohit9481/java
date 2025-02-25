interface mother{
    void Women();
}
interface Father{
    void Men();
}

class child implements mother,Father{
    public void Women(){
        System.out.println("mom");
    }
    public void Men(){
        System.out.println("papa");
    }
}
public class Multiple {
    public static void main(String[]args){
        child obj = new child();
        obj.Men();
        obj.Women();
    }
}

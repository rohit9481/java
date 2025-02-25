
//Encapsulation
class human {
    private int age = 11;
    private String name = "Rohit";
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        human obj = new human();
        System.out.println(obj.getAge() + obj.getName());
    }
}
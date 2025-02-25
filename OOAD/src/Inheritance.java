// single inheritance
/* code reusability
Extensibility(adding new features easily)
overriding (allow child class to redefine the method)
Avoiding code duplication, improve code readability


types:
single,multiple,multilevel,hybrid,hierarchical

 */
class Animal{
    void speak(){
        System.out.println("speaks");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking ");
    }
}
public class Inheritance {
    public static void main(String[]args){
        Dog obj= new Dog();
        obj.speak();
        obj.bark();
    }

}

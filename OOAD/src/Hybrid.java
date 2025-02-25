class Animall {
    void eat() {
        System.out.println("eating");
    }
}
// Correcting interface names
interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

// Correcting class names
class Bird extends Animall implements CanFly {
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Fish extends Animall implements CanSwim {
    public void swim() {
        System.out.println("Fish can swim");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.eat(); // ✅ Inherited from Animal
        obj.fly(); // ✅ Implemented from CanFly

        Fish objj = new Fish();
        objj.eat(); // ✅ Inherited from Animal
        objj.swim(); // ✅ Implemented from CanSwim
    }
}

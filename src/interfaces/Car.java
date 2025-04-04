package interfaces;

public class Car implements Engin,Break{

    @Override
    public void brake() {
        System.out.println("I brake a car");
    }

    @Override
    public void start() {
        System.out.println("I start  a car");

    }

    @Override
    public void stop() {
        System.out.println("I stop a car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate a car");

    }
}

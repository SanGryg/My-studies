package interfaces;

public class Chef implements Worker, Driver{

    @Override
    public void drive() {
        System.out.println("Chef drives a car");
    }

    @Override
    public void work() {
        System.out.println("Chef works");

    }
}

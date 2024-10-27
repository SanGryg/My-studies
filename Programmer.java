package interfaces;

public class Programmer implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Programmer drives a car.");
    }

    @Override
    public void work() {
        System.out.println("Programmer works");
    }
}
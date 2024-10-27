package interfaces;

public class Cat extends Animal implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("Сat food");
    }

    @Override
    public void run(){
        System.out.println("Cat run");
    }
}

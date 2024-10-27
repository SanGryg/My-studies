package interfaces;

import examples.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("I brought you " + dish);
            }
        }, "Pizza");

//        Director director = new Director();
//        director.force(new Worker() {
//            @Override
//            public void work() {
//                System.out.println("Work");
//            }
//        });

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<AbleToRun> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
////        animals.add(fish);
//        for (AbleToRun animal : animals) {
//           animal.run();
//
//        }
//        AbleToFly ableToFly = new Bird();
//        ableToFly.fly();

//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();

//        Director director = new Director();
//        Programmer programmer = new Programmer();
//        Chef chef = new Chef();
//
//        ArrayList<Worker> workers = new ArrayList<>();
//        workers.add(director);
//        workers.add(programmer);
//        workers.add(chef);
//        for (Worker worker : workers) {
//            worker.work();
//        }
//        ArrayList<Driver> drivers = new ArrayList<>();
//        drivers.add(programmer);
//        drivers.add(chef);
//        for (Driver driver : drivers) {
//            driver.drive();
//        }

    }
}

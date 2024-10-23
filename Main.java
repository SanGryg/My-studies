package test;

import examples.MyMath;
import examples.Person;

public class Main {

    public static void main(String... args) {
        MyArrayList employees = getEmployees();
        employees.add("Marharyta Smith");
        employees.remove("Olivia Smith");
        for(int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {

        MyArrayList employees = new MyArrayList();
        employees.add( "John Smith" );
        employees.add("Olivia Smith"); ;
        employees.add("Angelina Smith");
        employees.add("Sasha Smith");
        employees.add("Alisa Smith");
        return employees;
    }
}

//        System.out.println(MyMath.sum(1, 2, 3, 7, 10, 100, 777));

//        System.out.println(MyMath.length(10));

//        Person person = new Person("Sasha", 38);
//        person.setAge(-45);
//        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());

//        box.Box current = new box.Box(10);
//        box.Box another = current.increase();
//        current.showVolume();
//        another.showVolume();

//        examples.Monster monster = new examples.Monster(5);
//        monster.voice(10, "Aaaaaaa");

//        box.Box box = new box.Box(30);
//        box.showVolume();
//
//    }
//        System.out.println(examples.MyMath.multiple(5));
//    }
//        examples.Employee empl1 = new examples.Employee("Oleksandr Levytskyi", "Director", 12000 );
//        empl1.showInfo();
//    }

//        examples.Rectangle rect = new examples.Rectangle();
//        rect.setDimens(10, 5);
//        System.out.println(rect.getArea());
//    }
//        examples.Test test = new examples.Test();
//        System.out.println(test.square(20));
//    }
//        examples.Dog dog = new examples.Dog();
//
//        dog.name = "Max";
//        dog.breed = "Belgian shepherd";
//        dog.weight = 8;
//        dog.speed = 10;
//        dog.run();
//    }

//        box.Box box1 = new box.Box(10,10,10);
//
//        box.Box box2 = new box.Box(20,20,20);
//
//         box1.showVolume();
//
//         box2.showVolume();
//    }

//        examples.Person john = new examples.Person();
//
//        john.name = "John";
//        john.age = 15;
//        john.weight = 66;
//
//        examples.Person victor = new examples.Person();
//
//        victor.name = "Victor";
//        victor.age = 30;
//        victor.weight = 88;
//
//        examples.Person max = new examples.Person();
//
//        max.name = "Max";
//        max.age = 19;
//        max.weight = 70;
//
//        double sum = john.age + victor.age + max.age;
//        double result = sum / 3;
//        System.out.println(result);
//    }
//    }
//}
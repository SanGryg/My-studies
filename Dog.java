public class Dog {
    String name;
    String breed;
    double weight;

    int speed;

    String getInfo(){
        return " Name: " +name + " " + "Bread: " + breed + " " + "Weight: " + weight;
    }

    void run(){
      for (int i = 0; i < speed; i++){
          System.out.println("i run");
      }
    }
}

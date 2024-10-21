package box;

public class Box {
   private double length;
   private double width;
   private double height;

   public Box() {
        this(10);
    }

   public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

   public Box copy() {
        return new Box(this.length, this.width, this.height);

    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

   public void compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        } else {
            System.out.println("Current == Another");
        }
    }

    public double getVolume() {
        return length * width * height;
    }
    public void showVolume() {
        System.out.println(getVolume());
    }
}

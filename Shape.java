package inheritance;

public  abstract class Shape {
   private int a;
   private int b;

    public Shape(int b, int a) {
        this.b = b;
        this.a = a;
    }

    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }
    public abstract int getPerimeter();

    public final void showPerimeter(){
        System.out.println("Perimeter is: "+getPerimeter());
    }
}

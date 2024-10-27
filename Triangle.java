package inheritance;

public class Triangle extends Shape{

    public int c;

    public Triangle(int b, int a, int c) {
        super(b, a);
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return getA()+getB()+c;
    }
}

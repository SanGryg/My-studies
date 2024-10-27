package inheritance;

public class Rect extends Shape{

    public Rect(int b, int a) {
        super(b, a);
    }

    @Override
    public int getPerimeter() {
        return(getA() + getB()) * 2;
    }
}

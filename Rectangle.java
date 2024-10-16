public class Rectangle {

    double length;
    double width;
    void setDimens(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
}

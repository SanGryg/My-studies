package box;

public class Weight_box extends Box {

    private double weight;

    public Weight_box() {
        this.weight = 10;
    }

    public Weight_box(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public Weight_box(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public Weight_box(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight + "kg");
    }
}

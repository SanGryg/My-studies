public class Box {
    double length;
    double width;
    double height;

    Box(){
        this(10);
    }

    Box(Box another){
        this(another.length, another.width, another.height);
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size){
       this(size, size, size);
    }

    Box copy(){
        return new Box(this.length, this.width, this.height);

    }
    Box increase(){
        return new Box(this.length*2, this.width*2, this.height*2);
    }

    void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if(currentVolume > anotherVolume){
            System.out.println("Current > Another");
        }else if(currentVolume < anotherVolume){
            System.out.println("Current < Another");
        }else {
            System.out.println("Current == Another");
        }
    }

    double getVolume() {
        return length * width * height;
    }
    void showVolume() {
        System.out.println(getVolume());
    }
}

import java.text.NumberFormat.Style;

public class Constructor {

    double width;
    double height;
    double depth;

    Constructor() {
        System.out.println("Constructor without parametere");
        width = 10;
        height = 20;
        depth = 10;
    }

    Constructor(int a, int b, int c) {
        System.out.println("Constructor with parametere");
        width = a;
        height = b;
        depth = c;
    }

    double volume() {
        return width * height * depth;
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        Constructor cuboid1 = new Constructor();
        double vol;
        vol = cuboid1.volume();
        System.out.println("Volume1 is " + vol);
        Constructor cuboid2 = new Constructor(10, 4, 10);
        vol = cuboid2.volume();
        System.out.println("Volume2 is :" + vol);
    }
}
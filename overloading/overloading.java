package overloading;

public class overloading {

    static int plusMetodınt(int x, int y) {
        return x + y;
    }

    static double plusMetodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMetodınt(10, 50);
        double myNum2 = plusMetodDouble(10.9, 2.02);

        System.out.println("iNT :" + myNum1);
        System.out.println("Double :" + myNum2);
    }
}

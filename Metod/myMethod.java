public class myMethod {
    static void myMethod(String fname, int age) {
        System.out.println("My name is : " + fname);
        System.out.println("My age : " + age);

    }

    static int myMethod2(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod("Mahsum", 24);
        myMethod("Elon Musk", 45);
        myMethod("Timur", 90);

        int x = myMethod2(10, 10);
        System.out.println(x);
    }
}
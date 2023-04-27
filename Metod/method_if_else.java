/**
 * method_if_else
 */
public class method_if_else {

    static void checAge(int age) {

        if (age < 18) {
            System.out.println("Access  denied - You are not old enough");
        } else {
            System.out.println("Access granted - you are old enough");
        }
    }

    public static void main(String[] args) {
        checAge(21);
    }
}
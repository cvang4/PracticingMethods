package PracticingMethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(name("Twiggy"));
        System.out.println(number(34));
        System.out.println(truth(true));
    }

    public static String name(String user) {
        return user;
    }

    public static int number(int x){
        return x;
    }

    public static boolean truth(boolean t) {
        return t;
    }
}

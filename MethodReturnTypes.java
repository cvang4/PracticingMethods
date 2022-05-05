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

// // This is the second way I was able to do it too. Not sure which way was correct.

// public static void main(String[] args) {

// name("Johnny");
// number(11);
// truth(true);
// }

// public static void name(String user) {
// System.out.println(user);
// }

// public static void number(int x){
// System.out.println(x);
// }

// public static void truth(boolean t) {
// System.out.println(t);
// }
// }
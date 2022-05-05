package PracticingMethods;

public class AverageMethod {
    public static void main(String[] args) {
        averages();
        System.out.println("The average is: " + averages());
    }

public static int sums(int x, int y, int z) {
    int sum = x + y + z; 
    return sum;
}

public static double averages(){
    double average = sums(2,5,8) / 3;
    return average;
}
}
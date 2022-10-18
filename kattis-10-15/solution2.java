import java.util.*;

public class solution2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double one = 100.0/i;
        double two = 100.0/(100-i);
        System.out.printf("%.10f%n", one);
        System.out.printf("%.10f%n", two);
    }
}
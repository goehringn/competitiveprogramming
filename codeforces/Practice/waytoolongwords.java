import java.util.*;

public class waytoolongwords{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i == 2)
            System.out.println("NO");
        else if(i % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
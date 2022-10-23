import java.util.*;

public class solution3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt() - 1;
        int m = in.nextInt();
        int[] arr = new int[n];
        int j = 0;
        while(j < n){
            arr[j] = in.nextInt();
            j++;
        }
        HashSet<Integer> a = new HashSet<>();
        int count = 0;
        while(true){
            if(a.contains(s)){
                System.out.println("cycle");
                System.out.println(count);
                break;
            }
            if(s < 0){
                System.out.println("left");
                System.out.println(count);
                break;
            }
            if(s > n-1){
                System.out.println("right");
                System.out.println(count);
                break;
            }
            if(arr[s] == m){
                System.out.println("magic");
                System.out.println(count);
                break;
            }
            a.add(s);
            s+= arr[s];
            count++;
        }
    }
}
import java.io.*;
import java.util.*;

public class sol2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            int total = 0;
            for(int i = 0; i < n; i++){
                int te = 0;
                for(int j = i; j < n; j++){
                    if(te+arr[j] >= 0){
                        te+= arr[j];
                        total+= te;
                    }
                    else
                        break;
                }
            }
            System.out.printf("Case #%d: %d\n", t, total);
        }
        in.close();
    }
}
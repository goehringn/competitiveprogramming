import java.io.*;
import java.util.*;

public class sol3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = in.nextInt();
            int N = in.nextInt();
            int P = in.nextInt();
            HashMap<Integer,Integer> john = new HashMap<>();
            HashMap<Integer, Integer> max = new HashMap<>();
            for(int i = 1; i <= M; i++){
                if(i != P){
                    for(int j = 1; j <= N; j++){
                        int nex = in.nextInt();
                        int ma = Math.max(max.getOrDefault(j, 0), nex);
                        max.put(j, ma);
                    }
                }
                else{
                    for(int j = 1; j <= N; j++){
                        john.put(j, in.nextInt());
                    }
                }
            }
            int maxn = 0;
            for(int i = 1; i <= N; i++){
                if(john.get(i) < max.get(i)){
                    int temp = max.get(i) - john.get(i);
                    maxn += temp;
                }
            }
            System.out.printf("Case #%d: %d\n", t, maxn);
        }
        in.close();
    }
}
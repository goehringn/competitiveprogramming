import java.io.*;
import java.util.*;

public class sol1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int rs = in.nextInt();
            int rh = in.nextInt();
            int r = in.nextInt();
            double minr = Double.MAX_VALUE;
            List<Double> red = new ArrayList<>();
            List<Double> yellow = new ArrayList<>();
            for(int i = 1; i <= r; i++){
                int x = in.nextInt();
                int y = in.nextInt();
                double a = Math.pow(x,2) + Math.pow(y,2);
                double distance = Math.sqrt(a);
                if(distance < minr)
                    minr = distance;
                if(distance - rs <= rh)
                    red.add(distance);
            }
            double miny = Double.MAX_VALUE;
            int ye = in.nextInt();
            for(int i = 1; i <= ye; i++){
                int x = in.nextInt();
                int y = in.nextInt();
                double a = Math.pow(x,2) + Math.pow(y,2);
                double distance = Math.sqrt(a);
                if(distance < miny)
                    miny = distance;
                if(distance - rs <= rh)
                    yellow.add(distance);
            }
            int rt = 0;
            int yt = 0;
            for(int i = 0; i < red.size(); i++){
                if(red.get(i) < miny){
                    rt++;
                }
            }
            for(int i = 0; i < yellow.size(); i++){
                if(yellow.get(i) < minr)
                    yt++;
            }
            System.out.printf("Case #%d: %d %d\n", t, rt, yt);
        }
        in.close();
    }
}
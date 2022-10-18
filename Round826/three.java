import java.util.*;
import java.lang.*;

public class three{
	int mt = Integer.MAX_VALUE;
	public static void main(String[] args){
		three t = new three();
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		while(j > 0){
			j--;
			int size = in.nextInt();
			t.mt = size;
			int[] arr = new int[size];
			for(int i = 0; i < size; i++){
				arr[i] = in.nextInt();
			}
			t.bt(arr, 0, 0, size);
			System.out.println(t.mt);
			t.mt = Integer.MAX_VALUE;
		}

	}
	public void bt(int[] arr, int total, int i, int min){
		if(i == arr.length){
			mt = Math.min(mt, min);
			return;
		}
		int temp = 0;
		for(int j = i; j < arr.length; j++){
			temp += arr[j];
			if(total == 0)
				bt(arr, temp, j+1, Math.max(j-i+1, min));
			else if(temp == total)
				bt(arr, total, j+1, Math.max(j-1+1, min));
		}
	}
}
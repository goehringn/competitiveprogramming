import java.util.*;
public class test{
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5};
		int c = 5;
		change(arr ,c);
		System.out.println(arr);
		System.out.println(System.identityHashCode(c));
	}
	public static void change(int a[], int b){
		System.out.println(a);
		System.out.println(System.identityHashCode(b));
	}
}
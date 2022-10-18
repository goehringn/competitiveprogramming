import java.util.*;

// public class two{
// 	List<Integer> temp = new ArrayList<>();
// 	public static void main(String[] args){
// 		two g = new two();
// 		Scanner in = new Scanner(System.in);
// 		int j = in.nextInt();
// 		while(j > 0){
// 			j--;
// 			int a = in.nextInt();
// 			List<Integer> b = new ArrayList<>();
// 			boolean c = g.back(a, b, false);
// 			if(c){
// 				for(int i : g.temp)
// 					System.out.print(i + " ");
// 				System.out.println();
// 			}
// 			else	
// 				System.out.println(-1);
// 		}
// 	}
// 	public boolean back(int a, List<Integer> b, boolean l){
// 		if(b.size() == a){
// 			temp = new ArrayList<>(b);
// 			return true;
// 		}
// 		boolean h = false;
// 		for(int i = 1; i <= a; i++){
// 			if(h == true)
// 				return h;
// 			if(b.contains(i))
// 				continue;
// 			if(b.size() == a-1)
// 				l = true;
// 			b.add(i);
// 			if(b.size() != i && l == true && ((i-1) == b.get(b.size()-2) || (i+1) == b.get(b.size()-2)))
// 				h = back(a, b, false) || h;
// 			else if(b.size() != i && l == false){
// 				if(b.size() > 1 && (i+1 == b.get(b.size()-2) || i-1 == b.get(b.size()-2)))
// 					h = back(a,b,false) || h;
// 				else
// 					h = back(a, b, true) || h;
// 			}
// 			b.remove(b.size()-1);
// 		}
// 		return h;
// 	}
// }
public class two{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		while(j > 0){
			j--;
			int a = in.nextInt();
			if(a == 3)
				System.out.println(-1);
			else if(a == 2)
				System.out.println(2 + " " + 1);
			else{
				System.out.print(a-1 + " " + a);
				for(int i = 1; i < a-1; i++){
					System.out.print(" " + i);
				}
				System.out.println();
			}
		}
	}
}
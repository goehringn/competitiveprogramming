import java.util.*;

public class one{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		while(a > 0){
			a--;
			String b = in.nextLine();
			//String d = in.next();
			//System.out.println(b);
			String[] c = b.split(" ");
			//System.out.println(c[0] + " " + c[1]);
			if(c[0].charAt(c[0].length()-1) == 'S'){
				if(c[1].charAt(c[1].length()-1) == 'S'){
					if(c[1].length() < c[0].length())
						System.out.println("<");
					else if(c[1].length() > c[0].length())
						System.out.println(">");
					else
						System.out.println("=");
				}
				else{
					System.out.println("<");
				}
			}
			else if(c[0].charAt(c[0].length()-1) == 'M'){
				if(c[1].charAt(c[1].length()-1) == 'S')
					System.out.println(">");
				else if(c[1].charAt(c[1].length()-1) == 'M')
					System.out.println("=");
				else
					System.out.println("<");
			}
			else{
				if(c[1].charAt(c[1].length()-1) == 'L'){
					if(c[0].length() > c[1].length())
						System.out.println(">");
					else if(c[0].length() < c[1].length())
						System.out.println("<");
					else
						System.out.println("=");
				}
				else{
					System.out.println(">");
				}
			}
		}
	}
}
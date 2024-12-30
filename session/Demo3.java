package session;

	import java.util.Scanner;
	public class Demo3 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name");
			String name = sc.next();
			
			char ch;
			int diff = (int)('d'-'D');
			diff = diff<0?-1 * diff:diff;
			String resStr = "";
			for(int i=0;i<name.length();i++) {
				 ch = name.charAt(i);
				 if(ch >='a' && ch <='z') {
					 ch = (char)(ch -diff);
				 }//if
				 resStr = resStr+ch;
			}// for
			System.out.println("res---->"+resStr);

		}

	}



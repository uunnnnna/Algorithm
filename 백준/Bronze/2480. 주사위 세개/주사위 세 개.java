import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int max;
		
		if((a == b)&&(b == c)) sum = 10000 + a*1000;
		else if(a == b)sum = 1000+a*100;
		else if(b == c)sum = 1000+b*100;
		else if(c == a)sum = 1000+a*100;
		else {
			if(a>b) {
				if(c>a) max = c;
				else max = a;
			}
			else {
				if(c>b) max = c;
				else max = b;
			}
			
			sum = max*100;
		}
		System.out.println(sum);
		
	}
}

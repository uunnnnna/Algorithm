import java.util.*;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;

		for(int i = 0; i < K; i++) {
			int X = sc.nextInt();
			if(X == 0) stack.pop();
			else stack.push(X);
		}
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}	
}

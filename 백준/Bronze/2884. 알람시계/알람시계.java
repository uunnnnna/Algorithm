import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H == 0) {
			if(M < 45) {
				H = 23;
				M = M+15;
			}
			else if(M == 45) M = 0; // 사실상 필요 없는 코드
			else M = M-45;
		}
		else if( H != 0) {
			if(M < 45) {
				H = H-1;
				M = M+15;
			}
			else if(M == 45) M = 0; // 사실상 필요 없는 코드
			else M = M-45;
		}
		System.out.println(H + " " + M);
	}
}

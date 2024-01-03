[틀린코드]
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A == 23) {
			if(B+C < 60) {
				A = 23;
				B = B+C;
			}
			else {
				A = 0;
				B = (B+C)-60;
			}
		}
		else  {
			if(B+C < 60) {
				B = B+C;
			}
			else {
				if((B+C)-60 == 60) {
					A = A+1;
					B = (B+C)-60; 
				}
				else {
					A = A+(C%60);
					B = (B+C)-60;
				}
			}
		}
		System.out.println(A + " " + B);
	}
}


[정답코드]
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int min = A * 60 + B;
		min = min + C;
		int hour = (min / 60) % 24;
		int minute = min % 60;
		if( minute == 0)
			System.out.println(hour +" " + "0");
		else
			System.out.println(hour +" " +minute);
	}
}


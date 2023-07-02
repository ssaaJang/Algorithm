//최소공배수 구하기
//gcd(a,b) => 최대공약수
import java.util.Scanner;

public class LCM {

	static int gcd(int a,int b) {
		if(a<b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while(b!=0) {
			int k = a % b;
			a = b;
			b = k;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int lcm = a*b / gcd(a,b);
		
        System.out.println(lcm);
	}

}

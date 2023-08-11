import java.util.Scanner;
//투포인터 백준 기본 문제
// 로직 기억해둘 것
public class TwoPointer2003 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt=0;
		int [] ar = new int[N];
		for(int i=0;i<N;i++)
			ar[i] = sc.nextInt();
        
		int end =0;
		int sum = ar[0];
		for(int st=0;st<N;st++) {
			while(end<N && sum<=M) {
				if(sum==M) cnt++;
				end++;
				if(end!=N)
					sum = sum+ar[end];
				
			}
			if(end == N) break;
			sum =sum-ar[st];	
		}

        
		System.out.println(cnt);
	}

}

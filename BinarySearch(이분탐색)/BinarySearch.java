package algorithm;


public class BinarySearch {
	static int []A;
	static int n;
	//A={2,3,3,3,5,6} target=3

	//BinarySearch : target 이 존재하면 1, 아니면 0
	static int BS(int tar) {
		int start =0;
		int end = n-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(A[mid] < tar)
				start = mid+1;
			else if(A[mid] > tar)
				end = mid-1;
			else
				return 1;
		}
		return 0;
	}

	//lower : 처음 등장하는 3의 index
	static int lower(int tar) {
		int start=0;
		int end= n;

		while(start<end) {
			int mid = (start+end)/2;
			if(tar<=A[mid])
				end=mid;
			else
				start = mid+1;
		}
		return end;
	}
	// upper : 2의 index
	static int upper(int tar) {
		int start=0;
		int end= n;
		while(start<end) {
			int mid = (start+end)/2;
			if(tar<A[mid])
				end=mid;
			else
				start = mid+1;
		}
		return end;
	}



	public static void main(String[] args) {
		// 이분탐색 시 배열은 정렬할 것.

	}

}

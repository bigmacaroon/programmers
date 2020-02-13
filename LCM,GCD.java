class Solution_1 {

	public static void solution(int n, int m) {
		int[] answer = { n, m };
		int big = 0;
		if (m > n) { // 받은수중 더큰수를 big에 넣음
			big = m;
		} else {
			big = n;
		}
		for (int i = big; i < i + 1; i--) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
				break; // 최대공약수
			}
		}

		for (int i = big; i < i + 1; i++) {
			if (i % n == 0 && i % m == 0) {
				answer[1] = i; // 최소공배수
				break;

			}
		}

		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

	public static void main(String[] args) {
		int a = 40;
		int b = 22;

		solution(a, b);
		
	}
}

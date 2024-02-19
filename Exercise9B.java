class Exercise9B {
	public static int gcd(int a, int b){
		int r;
		a = Math.abs(a);	b = Math.abs(b);
		while (b > 0){
			r = a % b;
			a = b;	b = r;
		}
		return a;
	}
	public static int phi(int n){
		int cnt = 0;
		int k;
		for (k = 1;k <= n ;k++ ){
			if (gcd(k, n) == 1){
				cnt += 1;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println("Phi(100) " + phi(100));
		System.out.println("Phi(50) " + phi(50));
		System.out.println("Phi(41) " + phi(41));
	}
}//Supawit Saengrattanayon 64050694
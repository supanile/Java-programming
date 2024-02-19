class  Exercise9A{
	public static boolean isprime3(int n){
		int k;
		if (n == 0){
			return false;
		}
		if (n%2 == 0){
			return false;
		}
		for (k = 3;k*k <= n ;k += 2){
			if ( n%k == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.printf("list of prime: ");
		int cnt = 0;
		int i;
		for (i=101; i <= 200; i += 2){
			if(isprime3(i)){
				cnt += 1;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n");
		System.out.println("total prime between 100 to 200 is "+cnt);
	}
}//Supawit Saengrattanayon 64050694
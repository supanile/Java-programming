class Exercise10B {
	public static int remainder(int a, int k, int n){
		a = a%n;
		int r = 1, i;
		for(i=0; i < k ; i++ ){
			r = (r*a) % n;
		}
		return r;
	}
	public static void main(String[] args) {
		int a, k, n, r, r1, r2, r3;
		r = remainder(3, 2099, 7);
		System.out.println("r = "+r);
		r1 = remainder(555, 111, 11);
		System.out.println("r1 = "+r1);
		r2 = remainder(111, 555, 11);
		System.out.println("r2 = "+r2);
		r3 = (r1+r2) % 11;
		System.out.println("r3 = "+r3);
	}
}//Supawit Saengrattanayon 64050694
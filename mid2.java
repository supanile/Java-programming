class mid2 {
	public static void main(String[] args) {
		System.out.println(fun(1)+fun(2));
		}	
	public static int fun(int k){
		return Math.max(k*k+1,3*k+4);
		}
}

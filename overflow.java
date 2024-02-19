class overflow {
	public static void main(String[] args) {
		int x = 2147483647;
		System.out.println(x);
		int y = x + 1;
		System.out.println(y);
		y = y - 1;
		System.out.println(y); 
	}
}

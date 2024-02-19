class printf5A {
	public static void main(String[] args) {
		double amt1 = 2312.126, amt2 = -1425.672;
		System.out.printf( "....*....1....*....2....*....3....*....4 %n");
		System.out.printf( ": %12.4f %n", amt1 );
		System.out.printf( ": %-,12.4f %n", amt2 );
		System.out.printf( ": %(,12.2f %n", amt1);
		System.out.printf( ": %(,12.2f %n", amt2 );
		System.out.printf( ": %+,12.2f %n", amt1);
		System.out.printf( ": %+,12.2f %n", amt2 );
		System.out.printf( "....*....1....*....2....*....3....*....4 %n");
		System.out.printf("%10s%10S \n", "Java" , "Java");
		System.out.printf("%-10S%-10s \n", "Math", "Math");
	}
}//Supawit Saengrattanayon 64050694
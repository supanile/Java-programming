import java.util.Scanner;
class name {
	public static void main(String[] args) {
		int n;
		double sqr,a,b,c,f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();
		sqr = Math.sqrt(5);
		a = 1/sqr;
		b = Math.pow((1+sqr)/2,n);
		c = Math.pow((1-sqr)/2,n);
		f = a*(b-c);

		System.out.println("Fibonacci "+ n +"th : "+(int)f);
		//Supawit Saengrattanayon 64050694
	}
}

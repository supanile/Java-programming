import java.util.Scanner;
class test18 {
	public static void main(String[] args) {
		double i;
		double p;
		double r = 0.75;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal Amount : ");
		p = sc.nextDouble();
		System.out.print("Number of day : ");
		d = sc.nextInt();
		i = p*(r/100.0)*(d/365.0);
		System.out.printf("%-5s %,10.2f \n" , "p" , p);
		System.out.printf("%-5s %10.2f \n" , "R" , r);
		System.out.printf("%-5s %7d \n" , "N" , d);
		System.out.printf("%-5s %10.2f \n" , "I" , i);
	}
}

import java.util.Scanner;
class Exercise15C{
	public static void main(String[] args) {
		int n; double x;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number x : ");  x = kbd.nextDouble();
		System.out.print("Enter a number n : ");  n = kbd.nextInt();
		System.out.println("fpow is "+fpow(x,n));

	}
	public static double fpow(double x, int n){
	if(n==0)	return 1;
	else		return (x*fpow(x,n-1));
	}
}//Supawit Saengrattanayon 64050694
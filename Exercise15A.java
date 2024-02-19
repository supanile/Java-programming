import java.util.Scanner;
class Exercise15A{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long a = kbd.nextLong();
		System.out.println("fact is "+fact(a));

	}
	public static long fact(long n){
	if(n==0)	return 1;
	else		return n*fact(n-1);
	}
}//Supawit Saengrattanayon 64050694
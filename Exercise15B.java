import java.util.Scanner;
class Exercise15B{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = kbd.nextInt();
		System.out.println("sum is "+sum(a));

	}
	public static int sum(int n){
	if(n==1)	return 1;
	else		return ((n*(n+1))/2);
	}
}//Supawit Saengrattanayon 64050694
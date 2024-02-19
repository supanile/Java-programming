import java.util.Scanner;
class Exercise15D {
	public static void main(String[] args) {
		int a;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number : ");
		a = kbd.nextInt();
		System.out.println("value =  "+sum2(a));
	}
	public static int sum2(int n){
	if(n==0)	 return 1;
	else		return sum2(n-1)+2;
	}
}//Supawit Saengrattanayon 64050694
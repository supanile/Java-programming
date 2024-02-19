import java.util.Scanner;
class Exercise8B {
	public static int InputInt(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	public static void compute(int n){
		int res = 0, x = -1;
		int i = 1;
		while (i <= n){
			x = x*(-1);
			res = res + (x*i);
			i = i+1;
		}
		System.out.println("result is : " + res);
	}
	public static void main(String[] args){
		int n;
		n = InputInt("Enter n : ");
		compute(n);
	}
}//Supawit Saengrattanayobn 64050694
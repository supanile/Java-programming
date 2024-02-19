import java.util.Scanner;
class Exercise8D {
	public static int InputInt(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	public static int sumN(int n){
		int s = 0;
		int sign = -1;
		int i = 1;
		while (i <= n){
			sign = sign*(-1);
			System.out.println("sign = "+sign);
			s += sign*i*(i+1);
			System.out.println("i = "+i);
			i = i+1;
		}
		return s;
	}
	public static void main(String[] args) {
		int n = InputInt("Enter Number : ");
		int s;
		while (n > 0){
			s = sumN(n);
			System.out.println("Sum = " + s);
			n = InputInt("Enter Number : ");
		}
	}
}//Supawit Saengrattanayon 64050694
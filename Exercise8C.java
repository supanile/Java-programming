import java.util.Scanner;
class Exercise8C {
	public static int InputInt(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	public static int SumPower3(int a,int b){
		int sum = 0;
		while (a <= b){
			sum += (int)(Math.pow(a, 3));
			a += 1;
		}
		return sum;
	}
	public static void main(String[] args) {
		int a,b,sum;
		a = InputInt("Enter a : ");
		b = InputInt("Enter b : ");
		sum = SumPower3(a, b);
		System.out.println("Sum is : " + sum);
	}
}//Supawit Saengrattanayon 64050694
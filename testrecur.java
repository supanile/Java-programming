import java.util.Scanner;
class testrecur {
	public static void main(String[] args) {
		int a;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter a number : ");
		a = kbd.nextInt();
		System.out.println("value =  "+triangle1(a));
	}
	public static int triangle1(int n){
	if(n==0) return 1;
	else return 2*triangle1(n-1)+4;
	}
}
//4.1 T(n) =2T(n-1)+4 , n>=1 and T(0) = 1
//check results T(n)=5*2^n - 4;
//Find T(2) = 16
//Find T(3) = 36

//DO 4.2-4.5
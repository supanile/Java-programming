import java.util.Scanner;
class Exercise10A {
	public static void triBox(int n){
		int i, o;
		int max = 1;
		for (i=1; i <= n ; i++){
			for (o=1; o <= max; o++){
				System.out.print("*");
			}
			System.out.println();
			max += 1;
		}
	}
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();
		triBox(n);
	}
}//Supawit Saengrattanayon 64050694
import java.util.Scanner;
class Exercise10D {
	public static void boxes(int n){
		int c, r;
		for (c = 1; c <= n; c++){
			System.out.print("*");
		}
		System.out.println();
		for (r = 2; r <= n-1; r++){
			System.out.print("*");
			for (c = 2; c <= n-1; c++){
				if(c-r == 0 || c+r == n+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}
		for (c = 1; c <= n; c++){
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		boxes(7);
	}
}//Supawit Saengrattanayon 64050694
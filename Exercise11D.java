import java.util.Scanner;
class Exercise11D {
	public static int getScore(double[] sc){
		int k = 0;//k for count input
		System.out.print("Enter score: ");
		Scanner kdb = new Scanner(System.in);
		double score = kdb.nextDouble();
		while (score >= 0.0 && score <= 100 && k < sc.length){
			sc[k] = score;
			k++;
			System.out.print("Enter score: ");
			score = kdb.nextDouble();
		}
		return k;
	}
	public static void tallyScore(int n, int[] T, double[] sc){
		int k;
		for (int i = 0; i < n; i++){
			if (sc[i] >= 91) k = 9;
			else if (sc[i] >= 81) k = 8;
			else if (sc[i] >= 71) k = 7;
			else if (sc[i] >= 61) k = 6;
			else if (sc[i] >= 51) k = 5;
			else if (sc[i] >= 41) k = 4;
			else if (sc[i] >= 31) k = 3;
			else if (sc[i] >= 21) k = 2;
			else if (sc[i] >= 11) k = 1;
			else k = 0;
			T[k] = T[k] + 1;
		}
	}
	public static void showTally(int[] T, int n){
		for(int k = 9; k >= 0; k--){
			if(k != 0)
				System.out.printf("%3d: %3d - %3d :%3d\n",k+1, (k*10)+1, (k+1)*10, T[k]);
			else
				System.out.printf("%3d: %3d - %3d :%3d\n",k+1, 0, 10, T[k]);
		}
		System.out.printf("%3s %10s :%3d\n", " ", "Total", n);
	}
	public static void main(String[] args) {
		int[] T = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] score = new double[100];
		int n = getScore(score);
		tallyScore(n, T, score);
		showTally(T, n);
	}
}
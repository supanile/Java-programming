class Array12B{
	public static boolean lowerTriangular(int[][] M){
		int i, j;
		for (i = 0; i < M.length; i++){
			for (j = i + 1; j < M[i].length; j++){
				if(M[i][j] != 0)
					return false;
					break;
			}
		}
		return true;
	}
	public static int[][] transposeMatrix(int[][] M){
		int[][] X = new int[M[0].length][M.length];
		int i, j;
		for (i = 0; i < M.length; i++){
			for (j = 0; j < M[i].length; j++){
				X[i][j] = M[j][i];
			}
		}
		return X;
	}
	public static void printMatrix(int[][] M){
		int i, j;
		for (i = 0; i < M.length; i++){
			for (j = 0; j < M[i].length; j++){
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] X = {{1, 2, 3}, {0, 5, 6}, {0, 0, 0}};
		int[][] Y;
		System.out.println("Matrix X");
		printMatrix(X);
		if (lowerTriangular(X))
			System.out.println("X is lower triangular");
		else
			System.out.println("X is not lower triangular");
		Y = transposeMatrix(X);
		System.out.println("Matrix Y");
		printMatrix(Y);
		if (lowerTriangular(Y))
			System.out.println("Y is lower triangular");
		else
			System.out.println("Y is not lower triangular");
	}
}//Supawit Saengrattanayon 64050694
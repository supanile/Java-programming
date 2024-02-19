class  Exercise11A{
	public static boolean equalArrays(int[] A, int[] B){
		int i;
		for(i=0; i < A.length; i++){
			if (A[i] != B[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] X = { 10, 20, 30, 40, 50 ,60 };
		int[] Y = { 10, 20, 40, 30, 60 ,50 };
		int[] Z = { 10, 20, 30, 40, 50 ,60 } ;
		if(equalArrays(X, Y)){
			System.out.println("X is equals Y");
		}
		else{
			System.out.println("X is not equals Y");
		}
		if(equalArrays(X, Z)){
			System.out.println("X is equals Z");
		}
		else{
			System.out.println("X is not equals Z");
		}
	}
}//Supawit Saengrattanayon 64050694
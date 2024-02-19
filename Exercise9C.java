import java.math.BigInteger;
class Exercise9C {
	public static void factorial(int n){
		int fact = 1;
		int i;
		for (i = 1 ; i<=n ; i++ ){
			fact = i*fact;
			System.out.println(i + "! = " + fact);
		}
	}
	public static void factorialBig(int n){
		int fact = 1;
		BigInteger fbig = BigInteger.ONE;
		BigInteger ibig;
		for (int i=1; i<=n ; i++){
			ibig = BigInteger.valueOf(i);
			fbig = fbig.multiply(ibig);
			System.out.println(i + "! = " + fbig );
		}
	}
	public static void main(String[] args) {
		factorial(20);
		System.out.println();
		factorialBig(20);
	}
}//Supawit Saengrattanayon 64050694
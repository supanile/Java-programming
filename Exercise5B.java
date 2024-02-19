import java.util.Scanner;
class Exercise5B{
	private static double getDouble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		double a = sc.nextDouble();
		return a;
		}
	public static double func(double x,double y,double z){
		double f = 2.0/3.0*x*Math.exp(y)+Math.log(z)+Math.sqrt(x);
		return f;
		}
	public static void main(String[] args){
		double x,y,z,f;
		x = getDouble("Enter X-value : ");
		y = getDouble("Enter Y-value : ");
		z = getDouble("Enter Z-value : ");
		f = func(x,y,z);
		System.out.println("Result is : "+ f);
		}
}//Supawit Saengrattanayon 64050694

import java.util.Scanner;
class Exercise4E {
	public static void main(String[] args) {
		double x,y1,y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x = ");
		x = sc.nextDouble();
		y1 = Math.log10(3*Math.pow(x,2)) + (2.0/3.0)*Math.pow(x,3) + Math.sin(2*x);
		System.out.println("value of funtion : "+y1);
		System.out.print("Enter x = ");
		x = sc.nextDouble();
		y2 = Math.log10(3*Math.pow(x,2)) + (2.0/3.0)*Math.pow(x,3) + Math.sin(2*x);
		System.out.println("value of funtion : "+y2);
		System.out.println("Max function : "+ Math.max(y1,y2));
	}//Supawit Saengrattanayon 64050694
}

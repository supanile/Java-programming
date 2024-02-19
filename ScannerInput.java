import java.util.Scanner; 
	public class ScannerInput {
	public static void main(String[] args) {
 		double a,b,c;
 			Scanner kbd = new Scanner(System.in);
     		System.out.print ("Enter 1st number: "); a = kbd.nextDouble(); //1
 			System.out.print ("Enter 2nd number: "); b = kbd.nextDouble(); //2
			System.out.println("Add: "+ (a+b) );
			System.out.println("Subtract: "+ (a-b) );
  			System.out.println("Multiply: "+ (a*b) );
 			System.out.println("Division: "+ a/b );

	//Supawit Saengrattanayon 64050694
	}
}

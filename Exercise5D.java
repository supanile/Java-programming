import java.util.Scanner;
public class Exercise5D {
  private static double getDouble(String msg) {
    Scanner sc = new Scanner(System.in);
    System.out.print(msg);
    double A = sc.nextDouble();
    return A;
    }
  public static double funcF(double x,double y){
    double f = (Math.pow(x,(2))+Math.pow(y,(5)))/(x+y+1);
    return f;
    }
  public static void main(String[]args){
    double  a,b,z;
    a = getDouble ("Enter A-value : ");
    b = getDouble ("Enter B-value : ");
    z = funcF(a,b);
    System.out.println("F-value is : "+ z);
  }
}//Supawit Saengrattanayon 64050694
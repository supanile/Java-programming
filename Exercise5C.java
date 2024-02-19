import java.util.Scanner;
public class Exercise5C {
  private static double getDouble(String msg) {
    Scanner sc = new Scanner(System.in);
    System.out.print(msg);
    double tot = sc.nextDouble();
    return tot;
    }
  public static double totalAmt(double p,double i,double n){
    double tot = p*Math.pow(1.0+(i/100.0),(n));
    return tot;
    }
  public static void main(String[]args){
    double  p,r,n,tamt;
    p = getDouble ("Principal Amount : ");
    r = getDouble ("Interest rate : ");
    n = getDouble ("Number of year : ");
    tamt = totalAmt(p,r,n);
    System.out.println("Total Amount is : "+ tamt);
 }   
}//Supawit Saengrattanayon 64050694
import java.util.Scanner;
public class Exercise6B {
    public static double getDouble (String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double d = sc.nextDouble();
        return d;
    }
    public static double funcX (double x){
        double f = 0.0;
        if		(x>0)	f = ((Math.pow(x,2)+2))/(x+1);
        else if (x<0)	f = (2*x)+(Math.sin(x));
        else			f = 2.0;
        return f;        
    }
    public static void main(String[] args){
        double x,y;
        x = getDouble("Enter X-value : ");
        y = funcX(x);
        System.out.println("Result is : "+ y);       
    }
}   //Supawit Saengeattanayon 64050694
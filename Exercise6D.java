import java.util.Scanner;
public class Exercise6D {
    public static double getDouble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double d = sc.nextDouble();
        return d ;
    }
    public static void quadSlove(double a,double b,double c){
        double r , x1 , x2 ;
        if (a!=0){
            r = (Math.pow(b,2)-(4*a*c));
            if (r>=0){
                x1 = ((-b)+Math.sqrt(r))/(2.0*a);
                x2 = ((-b)-Math.sqrt(r))/(2.0*a);
                System.out.println("root are "+x1+","+x2);
            }
            else System.out.println("no real root");
        }
        else System.out.println("It is not quadratic");
    }
    public static void main(String[] args){
        double a , b , c ;
        a = getDouble("Enter a : ");
        b = getDouble("Enter b : ");
        c = getDouble("Enter c : ");
        quadSlove(a,b,c);      
    }       
}//Supawit Saengrattanayon 64050694
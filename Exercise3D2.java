import java.util.Scanner;
import java.lang.Math;
class  Exercise3D2{
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        double xm,ym,d;
        Scanner kdb = new Scanner(System.in);
        System.out.print("Enter x1 : "); x1 = kdb.nextDouble();
        System.out.print("Enter y1 : "); y1 = kdb.nextDouble();
        System.out.print("Enter x2 : "); x2 = kdb.nextDouble();
        System.out.print("Enter y2 : "); y2 = kdb.nextDouble();
        xm = (x1 + x2)/2;
        ym = (y1 + y2)/2;
        d = Math.sqrt(Math.pow(xm-x1, 2)+Math.pow(ym-y1, 2));
        System.out.println("First point: ("+ x1 + ", "+ y1 +")");
        System.out.println("Second point: ("+ x2 + ", "+ y2 +")");
        System.out.println("Middle point: ("+ xm + ", "+ ym +")");
        System.out.println("Distance from 1st to Middle point : "+d);
        //Supawit Saengrattnanayon 64050694
    }
}
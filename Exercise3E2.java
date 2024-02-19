
import java.util.Scanner;

public class Exercise3E2 {
    public static void main(String[] args) {
        double r1 , r2 , area ;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter r1 : ");
        r1=sc.nextDouble();
        System.out.print("Enter r2 : ");
        r2=sc.nextDouble();

        area = Math.PI*(Math.pow(r1,2)-Math.pow(r2,2));
        System.out.println("Area is : "+area);
        
        sc.close();

        //Supawit Saengrattanayon 64050694
            
    }
    
}
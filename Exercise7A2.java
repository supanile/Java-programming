import java.util.Scanner;
public class Exercise7A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k = ");
        int k = sc.nextInt();
        int p ;
        switch(k) {
            case 1 : case 3 :
            p = 1 ; break;
            case 2 : case 4 :
            p = 2 ; break;
            case 5 :
            p = 3 ; break;
            default :
            p = 4 ;
        }
        System.out.println("P = "+p);        
    } 
}//Supawit Saengrattanayon 64050694
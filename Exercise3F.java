import java.util.Scanner;
public class Exercise3F{    
	public static void main(String[] args) {
        double price1 , price2 , TotalAmt , Vat , Netamt , Amont1 , Amont2 ;
        int quanity1 , quanity2 ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Quanity 1 : ");
        quanity1=sc.nextInt();
        System.out.print("Price 1 : ");
        price1=sc.nextDouble();
        System.out.print("Quanity 2 : ");
        quanity2=sc.nextInt();
        System.out.print("Price  2 : ");
        price2=sc.nextInt();
        Amont1 = quanity1*price1;
        Amont2 = quanity2*price2;
        TotalAmt = Amont1+Amont2;
        Vat = TotalAmt*(7.0/100.0);
        Netamt = TotalAmt+Vat;
        System.out.println("Product Amount = "+TotalAmt);
        System.out.println("VAT Amount = "+Vat);
        System.out.println("Total Amount = "+Netamt);
        sc.close();
        //Supawit Saengrattnayon 64050694
	}
}
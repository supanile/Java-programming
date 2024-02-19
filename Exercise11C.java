import java.util.Scanner;
public class Exercise11C {
    public static void main(String[] args) {
        double[] sc = new double[50]; 
        int n = 10;
        double avg , std;
        getScore(sc,n);
        avg=avgScore(sc,n);
        std=sdScore(sc,avg,n);
        System.out.println("Average = "+avg);
        System.out.println("Std =  "+std);
    }
    public static void getScore( double [] sc, int n) {
        Scanner kbd = new Scanner (System.in);
        for(int i = 0 ; i < n ; i++){
        System.out.print("Enter Score "+(i+1)+": ");
        sc[i]=kbd.nextDouble();
        }
        kbd.close();
    }
    public static double avgScore(double[]sc , int n){
        double sum , avg;
        sum = 0.0 ;  3
        for (int i = 0 ; i < n ; i++ ){
        sum = sum + sc[i];
        }
        avg = sum/n; 
        return avg;        
    }
    public static double sdScore(double[]sc,double avg,int n){
        double sum = 0.0;
        double sd;
        for ( int i = 0 ; i < n ; i++ ){
        sum = sum + (Math.pow(sc[i], 2));
        }
        sd = Math.sqrt( (sum/n)-(avg*avg) ); 
        return sd;
        }
}//Supawit Saengrattanayon 64050694
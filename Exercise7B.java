import java.util.Scanner;
class Exercise7B {
    public static double readDouble(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double a = sc.nextDouble();
        return a ;      
		}    
    public static String grade(double sc){
        String gr = "" ;
        if (sc>=85.0)
        gr = "A";
        else if (sc>=70.0)
		gr = "B";
        else if (sc>=50.0)
        gr = "C";
        else if (sc>=40.0)
        gr = "D";
        else
        gr = "F";
        return gr ;
		}
    public static void main(String[] args) {
        String gr;
        double score;
        score = readDouble("Enter score : ");
        gr = grade(score);
        System.out.println("grade is : "+gr);
		}
}//Supawit Saengrattanayon 64050694
import java.util.Scanner;
class Exercise7D {
    public static int readInteger(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int year = sc.nextInt();
        return year;
		}
	public static boolean isLeafyear(int yr){
		boolean leaf;
		if(yr%4 == 0)
		if(yr%100 == 0)
		if(yr%400 == 0) 
		leaf = true;
		else leaf = false;
		else leaf = true;
		else leaf = false;
		return leaf;
		}
	public static void main(String[] args){
		int yr;
		boolean leaf;
		yr = readInteger("Enter year (A.C.):");
		leaf = isLeafyear(yr);
		if(isLeafyear(yr))
			System.out.println("The year "+ yr +" is leaf year");
		else
			System.out.println("The year "+ yr +" is not leaf year");
		}
}//Supawit Saengrattanayon 64050694

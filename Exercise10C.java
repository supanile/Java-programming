import java.util.Scanner;
class Exercise10C{
	public static boolean palindrome(String wd){
		String st = "";
		int i;
		for(i = wd.length()-1; i >= 0; i--){
			st = st + wd.charAt(i);
			System.out.println(st);
		}
		if(wd.equals(st)){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word : ");
		String word = sc.nextLine();
		while(word.equals("") == false){ 
			if(palindrome(word)){
				System.out.println("Yes, It is palindrome");
			}
			else{
				System.out.println("No.");
			}
			System.out.print("Enter word : ");
			word = sc.nextLine();
		}
		sc.close();
	}
}//Supawit Saengrattanayon 64050694
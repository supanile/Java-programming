import java.io.*;
import java.util.Scanner;
class Exercise14A {
	final static int MAX = 50;
	static int[] numbers;
	static int cntData = 0;
	public static void main(String[] args) throws IOException{
		numbers = new int[MAX];
		readData("reverse-in.dat");
		int index;
		for ( index = cntData-1; index >=0 ; index--){
			System.out.println(numbers[index]);
		}
		writeData("reverse-in.dat");
	}
	public static void readData(String filename) throws IOException{
		Scanner inFile = new Scanner( new FileReader( filename ) );
		int index = 0, value;
		while( inFile.hasNext() ){
			value = inFile.nextInt();
			numbers[index] = value;
			index++;
		}
		cntData = index;
		inFile.close();
	}
	public static void writeData(String filename) throws IOException{
		PrintWriter outFile = new PrintWriter( filename );
		int sum = 0;
		for (int index = cntData - 1; index >= 0; index--){
			sum += numbers[index];
		}
		System.out.println("Sum : " + sum);
		outFile.printf("All sum numbers : "+ sum);
		outFile.close();
	}
}//Supawit Saengrattanayon 64050694
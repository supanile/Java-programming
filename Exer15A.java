import java.util.Scanner;
class Exer15A {
    public static void main(String[] args){
        int x = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
		System.out.printf("Enter Weight :"); x = input.nextInt();
    while(x>=0){
        sum = sum + x;
		Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Weight :"); sum = sc.nextInt();
    }
        System.out.printf("Summary of weight : %d",sum);
        }
    }

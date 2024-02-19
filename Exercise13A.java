import java.util.Scanner;
public class Exercise13A {
    public static int[][] getTable ( int[][] T ){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter row : ");
        int rowUsed = inp.nextInt();
        System.out.print("Enter col : ");
        int colUsed = inp.nextInt();
        int a[][] = new int [rowUsed][colUsed];
        for ( int i= 0; i < rowUsed ; i++){
            for ( int j= 0; j < colUsed ; j++){
                a[i][j] = inp.nextInt();
            }
        }
        inp.close();
        return a ;
    }
    public static void printTable (int[][] T ){
        for ( int i= 0; i <T.length;i++) {
            for ( int j= 0; j < T[i].length;j++) {
            System.out.print(T[i][j]+"  ") ;    
            }
            System.out.println();
        }
    }
    public static int FindLarge(int[][] T) { 
        int max = T[0][0];
            for ( int i = 0; i < T.length; i++ ){
                for ( int j = 0; j < T[i].length;j++){
                    if (T[i][j]>max){
                    max=T[i][j];
                }
            }
        }System.out.println("Large value is : "+max);
        return max;
    }
    public static int sumColumn(int[][]A,int col){
        int sum = 0;
        for(int i = 0 ; i<A.length ; i++ ){
            sum += A[i][col];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int[][] T = new int [10][8];
        int X [][];
        X=getTable(T);
        printTable(X);
        FindLarge(X);
        for ( int i= 0; i <= X.length;i++) {
            System.out.println( "Sum of Column : "+(i+1)+" is "+sumColumn(X,i));
     
        }
        
    }
}
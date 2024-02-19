public class Exercise9D {
    public static int gcd(int a ,int b){
        int r;
        a=Math.abs(a);
        b=Math.abs(b);
        while(b>0){
            r=a%b;
            a=b;
            b=r;
        }
        return(a);
    }
    public static void findxy(int a , int b){
        int d=gcd(a, b);
        System.out.printf("a= %d , b= %d , d= %d", a,b,d);
        System.out.println();
        int x,y;
        for(x=-b;x<=b;x++){
            for(y=-a;y<=a;y++){
                if((a*x)+(b*y)==(d)){
                    System.out.printf("x= %d , y= %d",x,y);
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        findxy(5,7);
        System.out.println();
        findxy(10,14);
        System.out.println();
        findxy(15,21);
    }
}//Supawit Saengrattanayon 64050694

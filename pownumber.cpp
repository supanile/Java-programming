
#include<stdio.h>
int main()
{
    int base,exponent,i,pow=1;
    printf("Enter Base value : ");
    scanf("%d",&base);
    printf("Enter Exponent value : ");
    scanf("%d",&exponent);
    
    for(i=1;i<=exponent;i++)
    {
       pow = pow * base;                   
    }
    
    printf("Result is %d",pow);
   
    printf("");
    system("pause");

}
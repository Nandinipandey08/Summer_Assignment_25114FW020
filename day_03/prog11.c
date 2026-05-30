#include<stdio.h>
int gcd(int a,int b)
{   
    //base case
    if(b==0) 
    {
        return a;
    }
    //recursive case:gcd(a,b)=gcd(b,a%b)
    return gcd(b,a%b);
}
int main()
{
    int x,y;
    printf("enter the two number:");
    scanf("%d %d",&x ,&y);
    int hcf=gcd(x,y);
    printf("GCD of the two numbers %d and %d=%d\n",x,y,hcf);
    
    return 0;
}

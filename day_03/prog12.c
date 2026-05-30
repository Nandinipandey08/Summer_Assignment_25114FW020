#include<stdio.h>
//recursive gcd function
int gcd(int a,int b)
{
    if(b==0)
    {
        return a;
    }
    return gcd(b,a%b);
}
int lcm(int a,int b)
{
    return(a/gcd(a,b))*b;
}
int main()
{
    int x,y;
    printf("enter the two numbers:");
    scanf("%d %d",&x ,&y);

    printf("LCM of the two numbers %d and %d=%d\n",x ,y ,lcm(x,y));

    return 0;
}
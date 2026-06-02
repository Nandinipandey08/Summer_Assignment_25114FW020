#include<stdio.h>
long long power(int base,int exp)
{
    long long result=1;
    for(int i=1 ; i<=exp ; i++)
    {
        result=result*base;
    }
    return result;
}
int main()
{
    int base,exp;
    printf("enter the base and exponent:");
    scanf("%d %d",&base, &exp);

    if(exp<0)
    {
        printf("negative exponents cannot be handled\n");
    }
    else
    {
        printf("%d^%d=%lld\n",base,exp,power(base,exp));
    }

    return 0;
}
#include<stdio.h>
long long binarytodecimal(long long n)
{
    if(n==0)
    {
        return 0;
    }
    int lastdigit=n%10;
    return lastdigit + 2 * binarytodecimal(n/10);
}
int main()
{
    long long num;
    printf("enter the binary number:");
    scanf("%lld" ,&num);
    long long result=binarytodecimal(num);

    printf("decimal of %lld=%lld",num,result);
    return 0;
}
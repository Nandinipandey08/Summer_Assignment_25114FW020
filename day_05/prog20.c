#include<stdio.h>
long long largestprimefactor(long long n, long long i)
{
    if(i*i>n)
    {
        return(n>1?n:-1);
    }
    if(n%i==0)
    {
        return largestprimefactor(n/i,i);
    }
    return largestprimefactor(n,i+1);
}
int main()
{
    long long num;
    printf("enter the number:");
    scanf("%lld",&num);
    if(num<=1)
    {
        printf("invalid input.number must be greater than 0:\n");
        
    }
    else
    {
        printf("largest prime factor of %lld = %lld\n",num,largestprimefactor(num,2));
    }
    return 0;
}
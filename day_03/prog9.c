#include<stdio.h>
int isprime(int n)
{
    if(n<=1)
    {
        return 0;
    }
    for(int i=2 ; i<=n/2 ; i++)
    {
        if(n%i==0)
        {
            return 0;//not a prime number
        }
    }
    return 1;// prime number
}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d",&num);

    if(isprime(num))
    {
        printf("%d is prime",num);
    }
    else
    {
        printf("%d is not a prime",num);
    }
    return 0;

}

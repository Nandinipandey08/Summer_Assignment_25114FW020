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
            return 0;
        }
    }
    return 1;
}
int main()
{
    int start,end;
    printf("enter the start and end:");
    scanf("%d %d",&start ,&end);

    printf("the prime number between %d and %d:",start ,end);
    for(int i=start ; i<=end ; i++)
    {
        if(isprime(i))
        {
            printf("%d ", i);
        }
    }
    return 0;
}
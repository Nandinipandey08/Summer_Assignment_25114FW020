#include<stdio.h>
int fib(int n)
{
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    return fib(n-1)+fib(n-2);
}
int main()
{
    int terms;
    printf("enter the terms number:");
    scanf("%d" ,&terms);

    for(int i=0 ; i< terms ; i++)
    {
        printf("%d " ,fib(i));
    }

    return 0;
}

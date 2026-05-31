#include<stdio.h>
int fib(int n)
{
    int a=0,b=1,next;
    printf("FIBONACCI SEREIS:");
    for(int i=1 ; i<=n ; i++)
    {
        printf("%d" , i);
        next=a+b;
        a=b;
        b=next;
    }
}
int main()
{
    int terms;
    printf("enter the number terms:");
    scanf("%d" , &terms);
    fib(terms);
    return 0;
}

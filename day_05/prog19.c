#include<stdio.h>
//by recursion
void printfactors(int n,int i)
{
    if(i>n)
    {
        return;
    }
    if(n%i==0)
    {
        printf("%d ",i);
    }
    return printfactors(n ,i+1);
}
int main()
{
    int num;
    printf("enter the number:");
    sacnf("%d",&num);
    if(num <= 0)
    {
        printf("enter a positive number.\n");
        return 1;
    }

    printf("factors of %d", num);
    scanf("%d",num);
    printfactors(num , 1);
    return 0;
}
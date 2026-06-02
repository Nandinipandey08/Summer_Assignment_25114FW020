#include<stdio.h>
void decimaltobinary(int n)
{
    if(n>0)
    {
        decimaltobinary(n/2);
        printf("%d",n%2);
    }
}
int main()
{
    int num;
    printf("enter the decimal number:");
    scanf("%d" ,&num);

    printf("binary of %d=",num);
    if(num==0)
    {
        printf("0");
    }
    else
    {
     decimaltobinary(num);
    }

    printf("\n");
     return 0;
}
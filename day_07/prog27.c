#include<stdio.h>
//recursive sum of digits
int sumofdigits(int n)
{
    if(n==0)
    {
        return 0;
    }
    return(n%10)+sumofdigits(n/10);
}
int main()
{
    int num;
    printf("enter the numbers:");
    scanf("%d",&num);
    if(num<0)
    {
        num=-num;
    }

    printf("sum=%d",sumofdigits(num));
    return 0;
}
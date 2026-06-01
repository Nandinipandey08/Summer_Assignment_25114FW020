#include<stdio.h>
/* Strong numbers are sum of factorials of digits equal to number.
   Examples: 1, 2, 145, 40585 */
int fact(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    return n*fact(n-1);
}

int checkstrong(int n)
{
    int original=n , sum=0;
    while(n!=0)
    {
        int digit = n%10;
        sum+=fact(digit);
        n/=10;
    }
    return(sum==original);
}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d ",&num);

    if(num <= 0)
    {
        printf("Please enter a positive number.\n");
        return 1;
    }

    if(checkstrong(num))
    {
        printf("%d is a strong number:",num);
    }
    else
    {
        printf("%d is not a strong number:",num);
    }
    return 0;
}
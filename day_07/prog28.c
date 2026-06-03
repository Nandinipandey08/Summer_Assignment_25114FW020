#include<stdio.h>
//recursive reversing of number
int reverseNumber(int n,int rev)
{
    if(n==0)
    {
        return rev;
    }
    rev=rev*10+n%10;
    return reverseNumber(n/10,rev);
}
int main()
{
     int num;
    printf("Enter the number: ");
    scanf("%d", &num);
    if(num<0)
    {
        num=-num;
    }
    printf("Reversed = %d\n", reverseNumber(num, 0));

    return 0;
}
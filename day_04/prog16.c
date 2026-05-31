#include<stdio.h>
int countdigits(int n)
{
    if(n==0)
    {
        return 1;
    }
    if(n<0)
    {
        n=-n;
    }
    int count=0;
    while(n!=0)
    {
      n/=10;
      count++;
    }
    return count;
}

/*taken power function because as we know that pow() will return 
somewhat 152.999,(as we know it returns double) instead of 153(is armstrong no.) 
and it will be going to assing by a value 152, which is not an armstrong number.*/

int intpow(int base, int exp) 
{
    int result = 1;
    for(int i = 0; i < exp; i++)
        result *= base;
    return result;
}

int isarmstrong(int n)
{
    int original=n,sum=0;
    int numdigit=countdigits(n);
    while(n!=0)
    {
        int digit=n%10;
        sum+= intpow(digit,numdigit);
        n/=10;
    }
    return(sum==original);
}
int main()
{
    int start,end;
    printf("enter the start and end:");
    scanf("%d %d" ,&start,&end);
    printf("armstrong numbers between %d and %d:",start,end);

    for(int i=start ; i<=end ; i++)
    {
        if(isarmstrong(i))
        {
            printf("%d\n " , i);
        }
    }
    return 0;
}
#include <stdio.h>
#include <math.h>

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
    int count = 0;
    while(n != 0)
    {
        n = n / 10;
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
    int original = n;
    int sum = 0;
    int numdigit = countdigits(n);

    while(n != 0)
    {
        int digit = n % 10;
        sum += intpow(digit, numdigit);
        n /= 10;
    }

    return (sum == original);
}

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d ", &num);

    if(isarmstrong(num))
        printf("Armstrong number\n");
    else
        printf("Not an Armstrong number\n");

    return 0;
}
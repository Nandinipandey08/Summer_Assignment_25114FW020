#include<stdio.h>
//factorial
int fact(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    return n*fact(n-1);
}
int main()
{
    int num;
    printf("factorial of%d = %d\n", num,fact(num));
    return 0;
}
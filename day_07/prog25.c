#include<stdio.h>
//recursive factorial
#include<stdio.h>
int factorial(int n)
{
if(n==0||n==1)
{
    return 1;
}
 return n*factorial(n-1);
}
int manin()
{
    int num;
    int result=factorial(num);
    printf("the factorial of %d is %d", num,result);
    return 0;
}
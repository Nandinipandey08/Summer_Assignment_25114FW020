#include<stdio.h>
int productofdigits(int n)
{
    if(n==0)
    {
     return 0;
    }

    int product=1;

    if(n<0)
    {
        n=-n;
    }
    while(n>0)
    {
        product*=n%10;
        n/=10;
    }
    return product;

}
int main()
{
 int num;
 printf("enter the number:");
 scanf("%d",& num);

 printf("product=%d",productofdigits(num));
 return 0;
}
#include<stdio.h>
 int sumofdigits(int n)
 {
    int sum=0;
    if(n<0)
    {
        n=-n;
    }
    while(n>0)
    {
        sum+=n%10;
        n/=10;
    }
    return sum;
 }
 int main()
 {
    int num;
    printf("enter the number:");
    sanf("%d",&num);

    printf("sum=%d",sumofdigits(num));
    return 0;
 }



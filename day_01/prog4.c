#include<stdio.h>
int countdigits(int n)
{
    int count=0;
    if(n=0)
    {
        return 1;
    }
    if(n<0)
    {
        n=-n;
    }
    while(n!=0)
    {
        n=n/10;
        count++;
    }
    return count;
}

int main(){
    int n,count;
    printf("enter the number");
    scanf("%d",& n);
    printf("number of digits in %d is %d",n,count);
    return 0;
}

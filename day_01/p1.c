#include<stdio.h>
int calculatesum(int n)
{
    int sum=0;
    for(int i=1 ; i<n ; i++)
    {
     sum+=i;
    }
    return sum;
}
 int main(){
    int n;
    printf("enter N");
    scanf("%d,& n");
    int result=calculatesum(n);

    if(n<1)
    {
        printf("enter the number greater than 0:");
    }
    else
    {
        printf("sum of first %d natural number is %d",n,result );
    }
    return 0;
 }
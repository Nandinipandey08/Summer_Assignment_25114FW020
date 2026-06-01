#include<stdio.h>

/*perfect number are those numbers whose factor
 when added equals to that particular number.*/

int isperfect(int n)
{
    int sum=0;
    if(n<=1)
    {
        return 0;
    }
    for(int i=1 ; i<=n/2 ; i++)
{
    if(n % i==0)
    {
        sum+=i;
    }
}
return(sum==n);

}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d",&num);

    if(isperfect(num))
    {
        printf("%d is a perfect number.",num);
    }
    else
    {
     printf("%d is not a perfect number.",num);
    }
    return 0;
}

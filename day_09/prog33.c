#include<stdio.h>
//reverse star pattern

int main()
{
    int n;
    printf("enter the rows:");
    scanf("%d",&n);

    for(int i=n ; i>=1 ; i--)
    {
        for(int j=1 ; j<=i ; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}
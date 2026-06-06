#include<stdio.h>
//reverse star pyramid
int main()
{
    int n;
    printf("enter the rows:");
    scanf("%d",&n);

    for(int i=n ; i>=1 ; i--)
    {
        for(int space=1 ; space<=n-i ; space++)
        {
            printf(" ");
        }
        for(int j=1 ; j<=2*i-1 ; j++)
        {
            printf("*");
        }

        printf("\n");
    }
     return 0;
}
#include<stdio.h>
//star pyramid
int main()
{
    int n;
    printf("enetr the rows:");
    scanf("%d",&n);

    for(int i=1 ; i<=n ; i++)
    {
        for(int space=1 ; space<=n-i ; space++)
        {
            printf(" ");
        }

        for(int j=i ; j<=2*i-1 ; j++)
        {
           printf("*");

         }

    printf("\n");

    }
    return 0;
    
}
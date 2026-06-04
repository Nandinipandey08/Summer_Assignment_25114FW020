#include<stdio.h>
//to print half pyramid pattern
int main()
{
    int n;
    printf("enter the the row:");
    scanf("%d",&n);

    for(int i=1 ; i<=n ; i++)
    {
        for(int j=1 ; j<=i ; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}

#include<stdio.h>
//character pyramid
int main()
{
    int n;
    printf("enter the rows:");
    scanf("%d",&n);

    for(int i=1 ;i<=n ; i++)
    {
        for(int space=1 ; space<=n-i ; space++)
        {
            printf(" ");
        }
        for(int j=1 ; j<=i ; j++)
        {
            printf("%c",'A'+j-1);
        }
        for(int j=i-1 ; j>=1 ; j--)
        {
            printf("%c",'A'+j-1);
        }
        printf("\n");
    }
    return 0;
}
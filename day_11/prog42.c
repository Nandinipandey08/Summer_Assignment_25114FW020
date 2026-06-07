#include<stdio.h>
//maximum of two number
int find_max(int a,int b)
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}
int main()
{
    int x,y;
    printf("max = %d\n" , find_max(x,y));
    return 0;
}
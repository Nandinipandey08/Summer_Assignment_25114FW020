#include<stdio.h>

void printtable(int num)
{ 
    int i;
    printf("multiplication table of %d:\n",num);
    for(i=1 ; i<=num ; i++);{
        printf("%d*%d=%d\n",num, i ,num*i);
    }

}
int main(){
    int num;
    printf("enter the number:");
    scanf("%d",&num);
    printtable(num);
    return 0;
    

}

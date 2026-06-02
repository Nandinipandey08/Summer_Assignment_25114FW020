#include<stdio.h>
int countsetbits(int n)
{
  int count=0;
  while(n>0)
{
 if(n & 1)
 {
 count++;
 }
 n= n>>1;

}
return count;

}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d" ,&num);

    printf("set bits in %d=%d",num,countsetbits(num));
    return 0;
}
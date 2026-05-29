#include<stdio.h>
int reverseNumber(int n)
{
    int rev=0;
<<<<<<< HEAD
     if(n < 0)
=======
    if(n < 0)
>>>>>>> da41a79176e13db3bd3aa2695468ca54b72a1c9c
     {
        n = -n;
     }
    while(n>0)
    {
        rev=rev*10+n%10;
        n/=10;
    }
    return rev;
}
int main()
{
 int num;
 printf("enter the number:");
 scanf("%d",&num);
<<<<<<< HEAD

 if(num < 0)
=======
if(num < 0)
>>>>>>> da41a79176e13db3bd3aa2695468ca54b72a1c9c
 {
        printf("Reversed = -%d\n", reverseNumber(num));
 }
 else
<<<<<<< HEAD
 {
        printf("Reversed=%d\n", reverseNumber(num));
 }
=======
{
 printf("reversed=%d",reverseNumber(num));
}
>>>>>>> da41a79176e13db3bd3aa2695468ca54b72a1c9c
 return 0;
}

#include<stdio.h>
int isPalindrome(int n)
{
    int original=n;
    int rev=0;
    if(n<0)
    {
      return 0;  
    }
    while(n>0)
    {
        rev=rev*10+n%10;
        n/=10;
    }
    return original==rev;
}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d",& num);

    if(isPalindrome(num))
    {
        printf("palindrome");
    }
    else
    {
        printf("not palindrome");
    }
    return 0;
}
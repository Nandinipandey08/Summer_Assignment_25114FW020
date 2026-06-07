#include<stdio.h>
#include<stdbool.h>
//check prime
bool is_prime(int n)
{
    if(n<=1)
    {
        return false ;
    }
    for(int i=2 ; i<=sqrt(n) ; i++)
    {
        if(n % i==0)
        {
            return false;
        }
        return true;
    }
}
int main()
{
    int num;
    if(is_prime(num))
    {
        printf("%d is prime\n" , num);
    }
    else
    {
        printf("%d is not prime\n" , num);
    
    }
    return 0;
}
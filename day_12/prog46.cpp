#include <iostream>
#include <cmath>
using namespace std;

class armstrongchecker
{
   int num;

   int countdigits()
   {
    int temp=num,count=0;
    while(temp>0)
    {
        temp/=10;
        count++;
    }
    return count;
   }

   public:
          armstrongchecker(int n)
          {
            num=n;
          }
          bool isarmstrong()
          {
           int digits=countdigits();
           int temp=num,sum=0;
           while(temp>0)
        {
          int digit = temp%10;
          sum+= pow(digit,digits);
          temp/=10;
        }
        return sum==num;
        }

};
int main()
{
    armstrongchecker a(153) ;
    cout<<"153"<<(a.isarmstrong()?"is armstrong":"is not armstrong")<<endl;
    return 0;
}


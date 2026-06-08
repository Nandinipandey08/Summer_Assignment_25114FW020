#include <iostream>
using namespace std;

class palindromechecker
{
    int num;
public:
       palindromechecker(int n)
       {
        num=n;
       }
       bool ispalindrome()
       {
        int temp=num,rev=0;
        while(temp>0)
        {
            rev=rev * 10+ temp % 10;
            temp/=10;
        }
        return num==rev;
       }
       void display()
       {
        cout<<num<<(ispalindrome()? "is palindrome" : "is not palindrome")<<endl;
       }

};

int main()
{
    palindromechecker p(121);
    p.display();
    return 0;
}

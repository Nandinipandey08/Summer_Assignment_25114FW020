#include<iostream>
using namespace std;
 
class perfectchecker
{
    int num;

    int sumofdivisors()
    {
        int sum=0;
        for(int i=1 ; i<num ; i++)
        {
            if(num % i)
            {
                sum+=i;
            }
        }
        return sum;
    }

    public:
       perfectchecker(int n)
       {
        num=n;
       }
       bool isperfect()
       {
        return(num>0 && sumofdivisors()==num);
       }
       void display()
       {
        cout<<num<<(isperfect()? "is perfect":"is not perfect")<<endl;
       }
};
int main()
{
    perfectchecker p1(3);
    p1.display();

    perfectchecker p2(9);
    p2.display();
    return 0;
}

#include<iostream>
using namespace std;

void fibonacci(int n)
{
    int a=0,b=1;
    cout<<"fibonacci series: ";
    for(int i=1 ; i<n ; i++)
    {
        cout<<a<<" ";
        int next=a+b;
        a=b;
        b=next;
    }
    cout<< endl;
}
int main()
{
    int terms;
    fibonacci(terms);
    return 0;
}


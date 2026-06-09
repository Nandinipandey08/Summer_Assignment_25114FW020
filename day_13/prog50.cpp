#include<iostream>
using namespace std;
//sum and average of array

void sumavg(int arr[] ,int n)
{
    int sum=0;
    for(int i=0 ; i<n ; i++)
    {    
        sum+=arr[i];
    }
    
    float avg= (float)sum/n;

    cout<< "sum :"<< sum << endl;
    cout<<"Average : "<< avg<< endl;
}
int main()
{
    int arr[100],n;
    sumavg(arr,n);
    return 0;

}
#include<iostream>
using namespace std;

//frequency of an element
int frequency(int arr[] ,int n, int key)
{
    int count=0;
    for(int i=0 ; i<n ; i++)
    {
        if(arr[i] == key)
        {
            count++;
        }
    }
    return count;
}
int main()
{
    int n,arr[100],key;
    cout<< key <<"occurs " << frequency(arr,n,key) << "times";
    return 0;
}
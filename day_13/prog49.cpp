#include<iostream>
using namespace std;
//INPUT AND DISPLAY ARRAY

void inputdisplay(int arr[] , int n)
{
    cout<<"Enter "<<n<<" elements :";
    for(int i=0 ; i<n ; i++)
    {
        cin>>arr[i];
        cout<< "array :";
    }
    for(int i=0 ; i<n ; i++)
    {
        cout<<arr[i]<< " ";
    }
}
int main()
{
    int n,arr[100];
    inputdisplay(arr,n);
    return 0;
}


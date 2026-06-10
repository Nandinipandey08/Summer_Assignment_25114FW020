#include<iostream>
using namespace std;
//linear search
int linearsearch(int arr[] , int n , int key)
{
    for(int i=0 ; i<n ; i++)
    {
        if(arr[i] == key)
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    int arr[100],n,key;
    int res = linearsearch(arr , n , key);
    if(res!=-1)
    {
        cout<<"found at index: "<< res;
    }
    else
    {
        cout<< "not found:";
    }
    return 0;

}
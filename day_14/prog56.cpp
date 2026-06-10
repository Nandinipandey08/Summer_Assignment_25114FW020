#include<iostream>
using namespace std;
//duplicates in array
void printduplicate(int arr[] , int n)
{
    bool foundAny=false;
    cout<<"duplicates: ";

    for(int i=0 ; i<n ; i++)
    {
      bool alreadyprinted=false;

      for(int k=0 ; k<i ; k++)
      {
        if(arr[i] == arr[k])
        {
            alreadyprinted = true;
            break;
        }
      }
      if (alreadyprinted)
      {
        continue;
      }
      for(int j=i+1 ; j<n ; j++)
      {
        if(arr[i] == arr[j])
        {
            cout<< arr[i]<< " ";
            foundAny=true;
            break;
         }
      }
    }
    if(!foundAny)
    {
        cout<<"None";
    }
    
}
int main()
{
    int n;
    cout<<"enter size: ";
    cin>> n;

    int arr[100];
    cout<<"enter the size:";
    for(int i=0 ; i<n ; i++)
    {
        printduplicate(arr , n);
    }
    return 0;
}
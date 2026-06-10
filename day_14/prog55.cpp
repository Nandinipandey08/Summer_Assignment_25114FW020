#include<iostream>
#include<climits>
using namespace std;

int findsecondlargest(int arr[], int n)
{
    if(n < 2)
    {
        return -1;
    }

    int largest = INT_MIN;
    int secondlargest = INT_MIN;
    for(int i = 0; i < n; i++)
    {
        if(arr[i] > largest)
        {
            secondlargest = largest;
            largest = arr[i];
        }
        else
        {
            if(arr[i] > secondlargest && arr[i] != largest)
            {
                secondlargest = arr[i];
            }
        }
    }
    return (secondlargest == INT_MIN) ? -1 : secondlargest;
}

int main()
{
    int n, arr[100];
    cout << "enter the size: ";
    cin >> n;

    cout << "enter the elements: ";
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int res = findsecondlargest(arr, n);
    if(res == -1)
    {
        cout << "no second largest number is found";
    }
    else
    {
        cout << "second largest: " << res;
    }

    return 0;
}
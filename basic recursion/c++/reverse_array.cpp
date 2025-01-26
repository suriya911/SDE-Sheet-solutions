#include <iostream>
using namespace std;

void reverseArray(int arr[], int start, int end)
{
    if (start >= end)
    {
        return;
    }
    swap(arr[start], arr[end]);
    reverseArray(arr, start + 1, end - 1);
}

int main()
{
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;
    int *arr = new int[n];
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    reverseArray(arr, 0, n - 1);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}
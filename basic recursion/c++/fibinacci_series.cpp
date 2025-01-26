#include <iostream>
using namespace std;

int fibonacci(int n)
{
    if (n <= 1)
        return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

void printFibonacciSeries(int n)
{
    for (int i = 0; i < n + 1; i++)
    {
        cout << fibonacci(i) << " ";
    }
    cout << endl;
}

int main()
{
    int n;
    cin >> n;
    printFibonacciSeries(n);
    return 0;
}
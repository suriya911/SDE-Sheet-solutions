#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        if (i == 0 || i == n - 1)
        {
            cout << string(n, '*') << endl;
        }
        else
        {
            cout << "*" << string(n - 2, ' ') << "*" << endl;
        }
    }
    return 0;
}
#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cout << string(n - i, ' ');
        cout << string(i * 2 - 1, '*');
        cout << endl;
    }

    for (int i = n; i > 0; i--)
    {
        cout << string(n - i, ' ');
        cout << string(i * 2 - 1, '*');
        cout << endl;
    }
    return 0;
}
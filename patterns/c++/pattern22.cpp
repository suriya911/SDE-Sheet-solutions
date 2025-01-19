#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = -n + 1; i < n; i++)
    {
        for (int j = -n + 1; j < n; j++)
        {
            cout << (abs(i) > abs(j) ? abs(i) + 1 : abs(j) + 1);
        }
        cout << endl;
    }
    return 0;
}
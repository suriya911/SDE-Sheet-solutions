#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << (j % 2 == i % 2 ? "1 " : "0 ");
        }
        cout << endl;
    }
    return 0;
}
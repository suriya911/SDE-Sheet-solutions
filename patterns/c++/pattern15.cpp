#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (char i = 'A' + n - 1; i >= 'A'; i--)
    {
        for (char j = 'A'; j <= i; j++)
        {
            cout << j;
        }
        cout << endl;
    }
    return 0;
}
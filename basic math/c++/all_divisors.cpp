#include <iostream>
using namespace std;

void all_divisors(int n)
{
    for (int i = 1; i * i <= n; i++)
    {
        if (n % i == 0)
        {
            cout << i << " ";
            if (i != n / i)
                cout << n / i << " ";
            cout << endl;
        }
    }
}

int main()
{
    int n;
    cin >> n;
    all_divisors(n);
    return 0;
}
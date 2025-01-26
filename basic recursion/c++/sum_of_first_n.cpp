#include <iostream>
using namespace std;

int sumOfFirstN(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return n + sumOfFirstN(n - 1);
}
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "Sum of first " << n << " natural numbers is: " << sumOfFirstN(n) << endl;
    return 0;
}
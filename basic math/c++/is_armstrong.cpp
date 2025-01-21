#include <iostream>
using namespace std;

int isArmstrong(int n)
{
    int sum = 0, temp = n;
    while (n > 0)
    {
        int rem = n % 10;
        sum += rem * rem * rem;
        n /= 10;
    }
    return sum == temp;
}

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << n << (isArmstrong(n) ? " is an Armstrong number." : " is not an Armstrong number.") << endl;
    return 0;
}
#include <iostream>
using namespace std;

int main()
{

    int n;
    cin >> n;

    int temp = n;
    int rev = 0;

    while (temp > 0)
    {
        int last_digit = temp % 10;
        rev = rev * 10 + last_digit;
        temp = temp / 10;
    }

    if (rev == n)
    {
        cout << "Palindrome" << endl;
    }
    else
    {
        cout << "Not Palindrome" << endl;
    }

    return 0;
}
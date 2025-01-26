#include <iostream>
using namespace std;

void printName(int n, string name)
{
    if (n == 0)
    {
        return;
    }
    cout << name << " ";
    printName(n - 1, name);
}

int main()
{
    int n;
    string name = "to_repeat";
    cout << "Enter a number: ";
    cin >> n;
    printName(n, name);
    return 0;
}
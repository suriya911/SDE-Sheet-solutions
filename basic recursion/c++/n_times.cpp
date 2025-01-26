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
    string name;
    cout << "Enter a number: ";
    cin >> n;
    cout << "Enter a name: ";
    cin >> name;

    printName(n, name);
    return 0;
}
#include <iostream>
 
using namespace std;
 
int main() {
 
	int len;
	string phrase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
	cin >> len;
	for(int i = 0; i < len; i++)
		cout << phrase[i];
	cout << "\n";
 
    return 0;
}

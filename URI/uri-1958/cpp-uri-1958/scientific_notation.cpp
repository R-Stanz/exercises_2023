#include <iostream>
#include <iomanip>
#include <string>
 
using namespace std;
 
int main() {
 
	string number;
	cin >> number;
	double double_number = stod(number);

	if(double_number >= 0 && number[0] != '-')
		cout << "+";

	cout << uppercase << setprecision(4) << scientific << double_number << endl;
 
	return 0;
}

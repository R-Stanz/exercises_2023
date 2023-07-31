#include <iostream>
 
using namespace std;
 
int main() {
 
	int first_age, second_age;
	cin >> first_age >> second_age;

	if((first_age < 6) || (second_age < 6))
		cout << "NO";

	else if((first_age >= 18) || (second_age >= 18) ||
		((first_age >= 14) && (second_age >= 14)))

		cout << "YES";
	else
		cout << "NO";

	cout << "\n";
 
	return 0;
}

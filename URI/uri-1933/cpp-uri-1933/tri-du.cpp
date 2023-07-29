#include <iostream>
 
using namespace std;
 
int main() {
 
	int first_card, second_card;
	cin >> first_card >> second_card;

	if(first_card == second_card)
		cout << first_card;
	else if(first_card >= second_card)
		cout << first_card;
	else
		cout << second_card;

	cout << "\n";
 
	return 0;
}

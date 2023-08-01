#include <iostream>
#include <set>
 
using namespace std;
 
int main() {
 
	int number_of_cards;
	cin >> number_of_cards;

	set<int> unique_cards;

	int repeated_cards = 0;

	for(int i = 0; i < number_of_cards; i++){
		int new_card;
		cin >> new_card;

		bool is_unique = unique_cards.insert(new_card).second;
		if(!is_unique)
			repeated_cards += 1;
	}
	cout << unique_cards.size() << "\n";
	cout << repeated_cards << "\n";
 
	return 0;
}

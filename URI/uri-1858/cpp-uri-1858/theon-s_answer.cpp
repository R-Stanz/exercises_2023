#include <iostream>
 
using namespace std;
 
int main() {
 
	int numbOfPeople;
	cin >> numbOfPeople;
	int minHit;
	int numbOfHits;
	cin >> minHit;
	int bestPerson = 1;

	for(int person = 2; person <= numbOfPeople; person++){
		cin >> numbOfHits;
		if(minHit > numbOfHits){
			minHit 		= numbOfHits;
			bestPerson 	= person;
		}
	}
	cout << bestPerson << "\n";

	return 0;
}

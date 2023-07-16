#include <iostream>
 
using namespace std;
 
int main() {
 
	int iterations, force;
	cin >> iterations;
	string hero;
	for(int i = 0; i < iterations; i++){
		cin >> hero >> force;
		if(hero == "Thor")	cout << "Y\n";
		else			cout << "N\n";
	}
 
    return 0;
}

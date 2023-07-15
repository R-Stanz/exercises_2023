#include <iostream>
 
using namespace std;
 
int main() {
 
	for(int scream = 0; scream < 3; scream++){
		string 	input 	= "";
		int 	sum 	= 0;
		getline(cin, input);
		while(input.at(0) != 'c'){
			for(int posi = 0; posi < 3; posi++){
				if(input.at(posi) == '*'){
					sum += 1 << 2-posi;
				}
			}
			cin >> input;
		}
		cout << sum << "\n";
	}
 
	return 0;
}

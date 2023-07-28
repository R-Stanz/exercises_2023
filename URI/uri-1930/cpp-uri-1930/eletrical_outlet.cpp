#include <iostream>
 
using namespace std;
 
int main() {
 
	int result = -3;
	int tmp;

	for(int i = 0; i < 4; i++){
		cin >> tmp;
		result += tmp;
	}

	cout << result << "\n";
 
	return 0;
}

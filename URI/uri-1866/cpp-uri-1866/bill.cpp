#include <iostream>
 
using namespace std;
 
int main() {
 
	int iterations, tmp;
	cin >> iterations;
	for(int i = 0; i < iterations; i++){
		cin >> tmp;
		if(tmp % 2 == 0)	cout << "0\n";
		else			cout << "1\n";
	}
 
    return 0;
}

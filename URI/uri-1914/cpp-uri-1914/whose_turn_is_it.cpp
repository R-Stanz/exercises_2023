#include <iostream>
 
using namespace std;
 
int main() {
 
	int iterations;
	cin >> iterations;
	for(int i = 0; i < iterations; i++){
		string p1, p1Choice, p2, p2Choice;
		cin >> p1 >> p1Choice >> p2 >> p2Choice;
		int p1Numb, p2Numb;
		cin >> p1Numb >> p2Numb;
		if(p1Choice == "PAR"){
			if((p1Numb + p2Numb) % 2 == 0) 	cout << p1 << "\n";
			else				cout << p2 << "\n";
		}
		else{
			if((p1Numb + p2Numb) % 2 == 0)	cout << p2 << "\n";
			else				cout << p1 << "\n";
		}
	}
 
    return 0;
}

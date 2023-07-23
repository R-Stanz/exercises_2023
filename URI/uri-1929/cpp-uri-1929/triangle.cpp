#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;

bool check(int a, int b, int c){

	if((a * a + b * b - 2 * a * b <= c * c) &&
	   (a * a + b * b + 2 * a * b > c * c))

		cout << "S\n";

	else return false;

	return true;
}
 
int main() {
 
	int arr[4];
	for(int i = 0; i < 4; i++){
		cin >> arr[i];
	}

	sort(arr, arr + 4);

	for(int a = 0; a < 2; a++){
		for(int b = a + 1; b < 3; b++){
			for(int c = b + 1; c < 4; c++){

				if(check(arr[a], arr[b], arr[c]))
					return 0;
			}
		}
	}
	cout << "N\n";
	return 0;
}

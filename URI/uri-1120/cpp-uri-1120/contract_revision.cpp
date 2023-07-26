#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
 
	char broken_digit 	= '0';
	string number		= "";

	while(!(broken_digit == '0' && number == "0")){
		cin >> broken_digit >> number;

		string tmp_number = "";
		for(int i = 0; i < number.length(); i++){
			char c = number[i];
			if(broken_digit != c)
				tmp_number += c;
		}

		int zeros_count = 0;
		for(int i = 0; i < tmp_number.length() - 1; i++){
			if(tmp_number[i] == '0')
				zeros_count += 1;
			else break;
		}

		string answer = "";
		for(int i = zeros_count; i < tmp_number.length(); i++)
			answer += tmp_number[i];

		if(!(broken_digit == '0' && number == "0")){
			if(tmp_number == "")
				cout << "0\n";
			else
				cout << answer << "\n";
		}
	}
	return 0;
}

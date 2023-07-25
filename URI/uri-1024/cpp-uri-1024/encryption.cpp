#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
 
	int iterations;
	cin >> iterations;

	for(int i = 0; i < iterations; i++){

		string phrase = "";
		while(phrase == "")
			getline(cin, phrase);

		string answer = phrase;
		bool first_half = true;

		for(int j = 0; j < phrase.length(); j++){

			if(j > (phrase.length() - 1)/2) 
				first_half = false;

			int char_val = (int) phrase[j];

			if((char_val > 64 && char_val <= 90) ||
				(char_val > 96 && char_val < 123)){
				
				if(!first_half)
					char_val += 3;
				else
					char_val += 2;
			}
			else if(first_half){
				if(char_val == 255)
					char_val = 0;
				else
					char_val -= 1;
			}
			int reverse_index 	= (phrase.length() - 1) - j;
			answer[reverse_index]	= (char) char_val;
		}
		cout << answer<< "\n";
	}
	return 0;
}

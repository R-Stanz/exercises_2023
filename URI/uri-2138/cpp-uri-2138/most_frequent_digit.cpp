#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
 
	char digits[10] {0};
	for(int i = 0; i < 10; i++)
		digits[i] = i + 48;
	
	string number;
	while(true){
		getline(cin, number);
		if(number.empty())
			break;

		int digits_counter[10] {0};

		for(int i = 0; i < number.length(); i++){
			char number_digit = number[i];
			for(int digit = 0; digit < 10; digit++){
				if(number_digit == digits[digit]){
					digits_counter[digit] += 1;
					break;
				}
			}
		}

		int biggest_count = digits_counter[0];
		int index_of_biggest_count = 0;

		for(int digit = 0; digit < 10; digit++){
			if(biggest_count <= digits_counter[digit]){
				biggest_count 		= digits_counter[digit];
				index_of_biggest_count 	= digit;
			}
		}
		cout << index_of_biggest_count << "\n";
	}
 
	return 0;
}

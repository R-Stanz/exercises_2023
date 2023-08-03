#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
 
	string str_number_of_pages;
	cin >> str_number_of_pages;

	long long int number_of_pages = stoll(str_number_of_pages);

	if(number_of_pages < 10){
		cout << number_of_pages << "\n";
		return 0;
	}

	int last_page_number_of_digits = str_number_of_pages.length();
	long long int number_of_digits = 0;
	long long int multiple_of_10   = 10;

	for(int i = 1; i <= last_page_number_of_digits; i++){
		if(i == last_page_number_of_digits)
			number_of_digits += i*number_of_pages;
		else
			number_of_digits += i*(multiple_of_10 - 1);

		if(multiple_of_10 != 10)
			number_of_digits -= i*((multiple_of_10/10) - 1);

		multiple_of_10 *= 10;
	}
	cout << number_of_digits << "\n";
 
	return 0;
}

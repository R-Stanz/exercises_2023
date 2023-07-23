#include <iostream>
#include <vector>
 
using namespace std;
 
int main() {
 
	int iterations;
	cin >> iterations;

	for(int i = 0; i < iterations; i++){

		int numb_of_people;
		int steps_size;

		cin >> numb_of_people >> steps_size;

		vector<int> circle {};
		for(int j = 0; j < numb_of_people; j++)
			circle.push_back(j+1);

		int last_death = 0;
		while(circle.size() != 1){

			int next_death = (last_death + steps_size - 1) % circle.size();
			circle.erase(circle.begin() + next_death);
			last_death = next_death;
		}
		cout << "Case " << i+1 << ": "; 
		cout << circle.at(0) << "\n";
	}
 
	return 0;
}

#include <iostream>
 
using namespace std;
 
int main() {
 
	while(true){
		int number_of_regions;
		cin >> number_of_regions;
		if(number_of_regions == 0)
			break;

		int step_size 		= 0;
		int regions_sample	= 3;

		while(regions_sample >= 2){

			step_size		+= 1;
			int last_region		= 12;
			int last_dropped_region = 1;

			for(regions_sample = number_of_regions - 1; regions_sample >= 1; regions_sample--){

				int dropped_region = (last_dropped_region + step_size - 1) % regions_sample;

				if(last_region == dropped_region)
					break;
				if(last_region > dropped_region)
					last_region -= 1;

				last_dropped_region = dropped_region;
			}
		}
		cout << step_size << "\n";
	}
	return 0;
}

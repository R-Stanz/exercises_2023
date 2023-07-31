#include <iostream>
 
using namespace std;
 
int main() {
 
	int jump_height, number_of_pipes;
	cin >> jump_height >> number_of_pipes;

	bool win = true;
	int last_pipe_height, next_pipe_height;

	for(int i = 0; i < number_of_pipes; i++){
		cin >> next_pipe_height;
		if(i == 0) 
			last_pipe_height = next_pipe_height;
		
		if((last_pipe_height - next_pipe_height > jump_height) ||
		   (next_pipe_height - last_pipe_height > jump_height))

			win = false;
		
		last_pipe_height = next_pipe_height;
	}
	if(win)
		cout << "YOU WIN\n";
	else
		cout << "GAME OVER\n";
 
	return 0;
}

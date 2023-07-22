import java.util.List;

public class QuickSortFromBeginning {

	private List<Double> array;

	QuickSortFromBeginning(List<Double> arr){
		this.array = arr;
	}

	public void sort(){
		this.sort(this.array, 0, this.array.size() - 1);
	}

	public void sort(List<Double> arr){
		this.sort(arr, 0, arr.size() - 1);
	}

	public void sort(List<Double> arr, Integer floor, Integer ceil){
		if(floor < ceil){
			Integer pivot = partition(arr, floor, ceil);
			sort(arr, floor, pivot - 1);
			sort(arr, pivot + 1, ceil);
		}
	}

	private Integer partition(List<Double> arr, Integer floor, Integer ceil){
		Integer smallers = floor -1;

		for(Integer pointer = floor; pointer < ceil; pointer++){
			if(arr.get(pointer) <= arr.get(ceil)){
				smallers += 1;
				swap(arr, pointer, smallers);
			}
		}
		swap(arr, smallers + 1, ceil);
		return smallers + 1;
	}

	private void swap(List<Double> arr, Integer pos1, Integer pos2){
		Double tmp = arr.set(pos1, arr.get(pos2));
		arr.set(pos2, tmp);
	}

	public void printArr(){
		System.out.println(this.array);
	}
}

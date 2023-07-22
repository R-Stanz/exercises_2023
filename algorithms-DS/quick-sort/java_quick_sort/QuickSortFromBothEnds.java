import java.util.List;
import java.util.ArrayList;

public class QuickSortFromBothEnds {

	private List<Double> array;

	QuickSortFromBothEnds(List<Double> arr) {
		this.array = arr;
	}

	public void sort() {
		this.sort(this.array, 0, this.array.size() - 1);
	}

	public void sort(List<Double> arr) {
		this.sort(arr, 0, arr.size() - 1);
	}

	public void sort(List<Double> arr,  Integer floor, Integer ceil) {
		if(floor <= ceil) {
			Integer pivot = partition(arr, floor, ceil);

			sort(arr, floor, pivot - 1);
			sort(arr, pivot + 1, ceil);
		}
	}

	private Integer partition(List<Double> arr, Integer floor, Integer ceil){
		Integer leftMarker	= floor;
		Integer rightMarker 	= ceil - 1;

		while(leftMarker <= rightMarker){

			this.swap(arr, leftMarker, rightMarker);

			while((leftMarker <= rightMarker) &&
			      (arr.get(leftMarker) <= arr.get(ceil)))

				leftMarker += 1;

			while((leftMarker <= rightMarker) &&
			      (arr.get(rightMarker) >= arr.get(ceil)))

				rightMarker -= 1;

		}
		swap(arr, leftMarker, ceil);
		return leftMarker;
	}

	private void swap(List<Double> arr, Integer pos1, Integer pos2){
		Double tmp = arr.get(pos1);
		arr.set(pos1, arr.get(pos2));
		arr.set(pos2, tmp);
	}

	public void printArr(){
		System.out.println(this.array);
	}
}

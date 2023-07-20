import java.util.ArrayList;
import java.util.List;

public class MergeSortBy3{

	private List<Double> array = new ArrayList<Double>();

	MergeSortBy3(List<Double> arr){
		this.array = arr;
	}

	public void sort(){
		this.sort(this.array);
	}

	public void sort(List<Double> arr){
		if(arr.size() == 1) return;
		else if(arr.size() == 2){
			if(arr.get(0) < arr.get(1)) ;
			else{
				Double tmp = arr.remove(0);
				arr.add(tmp);
			}
			return;
		}

		List<Double> arr1 = new ArrayList<>(arr.subList(0, arr.size()/3));
		List<Double> arr2 = new ArrayList<>(arr.subList(arr.size()/3, 2*arr.size()/3));
		List<Double> arr3 = new ArrayList<>(arr.subList(2*arr.size()/3, arr.size()));

		this.sort(arr1);
		this.sort(arr2);
		this.sort(arr3);

		this.merge(arr, arr1, arr2, arr3);
	}

	private void merge(List<Double> arr, List<Double> arr1, 
			   List<Double> arr2, List<Double> arr3){

		Integer i = 0;
		Double tmp;
		while((!arr1.isEmpty()) && (!arr2.isEmpty()) && (!arr3.isEmpty())){
			if((arr1.get(0) < arr2.get(0)) && (arr1.get(0) < arr3.get(0))){
				this.addVal(arr, arr1, i);
			}
			else if( (arr2.get(0) < arr1.get(0)) &&
					(arr2.get(0) < arr3.get(0)) ){

				this.addVal(arr, arr2, i);
			}
			else if( (arr3.get(0) < arr1.get(0) &&
					(arr3.get(0) < arr2.get(0))) ){

				this.addVal(arr, arr3, i);
			}
			i += 1;
		}

		while((!arr1.isEmpty()) && (!arr2.isEmpty())){
			if(arr1.get(0) < arr2.get(0)){
				this.addVal(arr, arr1, i);
			}
			else{
				this.addVal(arr, arr2, i);
			}
			i += 1;
		}
		while((!arr1.isEmpty()) && (!arr3.isEmpty())){
			if(arr1.get(0) < arr3.get(0)){
				this.addVal(arr, arr1, i);
			}
			else{
				this.addVal(arr, arr3, i);
			}
			i += 1;
		}
		while((!arr2.isEmpty()) && (!arr3.isEmpty())){
			if(arr2.get(0) < arr3.get(0)){
				this.addVal(arr, arr2, i);
			}
			else{
				this.addVal(arr, arr3, i);
			}
			i += 1;
		}

		while(!arr1.isEmpty()){
			this.addVal(arr, arr1, i);
			i += 1;
		}
		while(!arr2.isEmpty()){
			this.addVal(arr, arr2, i);
			i += 1;
		}
		while(!arr3.isEmpty()){
			this.addVal(arr, arr3, i);
			i += 1;
		}
	}

	private void addVal(List<Double> arr, List<Double> tmpArr, Integer i){
		Double tmp = tmpArr.remove(0);
		arr.set(i, tmp);
	}

	public void printArr(){
		System.out.println(array);
	}
}

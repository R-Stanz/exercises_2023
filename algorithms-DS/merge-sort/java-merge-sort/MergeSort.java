import java.util.ArrayList;
import java.util.List;

public class MergeSort{

	private ArrayList<Double> arr = new ArrayList<Double>();

	MergeSort(ArrayList<Double> array){
		this.arr = array;
	}

	public void sort(){
		sort(this.arr);
	}

	public void sort(List<Double> arr){

		try{
			if(arr.size() < 2) return;
			
			List<Double> list1 = arr.subList(0, arr.size()/2);
			List<Double> list2 = arr.subList(arr.size()/2, arr.size());

			ArrayList<Double> arr1 = new ArrayList<Double>(list1);
			ArrayList<Double> arr2 = new ArrayList<Double>(list2);

			this.sort(arr1);
			this.sort(arr2);
			
			this.merge(arr, arr1, arr2);
			
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}
	}

	private void merge(List<Double> arr, List<Double> arr1, List<Double> arr2){

		Integer i = 0;

		while((arr1.size() > 0) && (arr2.size() > 0)){

			if(arr1.get(0) < arr2.get(0))
				setValueOnArr(arr, arr1, i);
			else
				setValueOnArr(arr, arr2, i);
			i += 1;
		}

		while(!arr1.isEmpty()){
			setValueOnArr(arr, arr1, i);
			i += 1;
		}

		while(!arr2.isEmpty()){
			setValueOnArr(arr, arr2, i);
			i += 1;
		}
	}
	
	private void setValueOnArr(List<Double> arr, List<Double> tmp, Integer index){
		Double val = tmp.remove(0);
		arr.set(index, val);
	}
}

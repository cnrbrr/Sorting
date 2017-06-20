import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class QuickSort {
	ArrayList<Integer> sortableArray = new ArrayList<Integer>();//array to be sorted
	int size;	//size of the array list
	int pivot;//pivot value

	public void generate(int size){//generate a random list
		this.size = size;

		Random selecter = new Random();

		for(int i = 0; i < size; i++){//size of the final array
			int tempNumber = selecter.nextInt((5000) + 1);//0 - 5000
			sortableArray.add(tempNumber);//add to the array list
		}
	}
	
	public void startSort(ArrayList<Integer> array){
		sortableArray = quickSort(array);//allows for better recursion
	}

	
	public ArrayList<Integer> quickSort(ArrayList<Integer> array){
		if (array.size() <= 1){//if only one value return
			return array;
		}
		ArrayList<Integer> lessThan = new ArrayList<Integer>();//less than pivot
		ArrayList<Integer> moreThan = new ArrayList<Integer>();//more than pivot
		ArrayList<Integer> EqualTo = new ArrayList<Integer>();//equal to pivot
		ArrayList<Integer> total = new ArrayList<Integer>();//add together then return
		
		pivot = calculatePivot(array);//set the new pivot
		
		for(int i = 0; i < array.size(); i++){
			if(array.get(i) < pivot){//fill less than
				lessThan.add(array.get(i));
			}
			
			if(array.get(i) > pivot){//fill more than
				moreThan.add(array.get(i));
			}
			
			if(array.get(i) == pivot){//fill equal to
				EqualTo.add(array.get(i));
			}
		}
		if(lessThan.size() > 1){//if more than 1 value sort it
			lessThan = quickSort(lessThan);
		}
		
		if(moreThan.size() > 1){//if more than one value sort it
			moreThan = quickSort(moreThan);
		}
		
		
		total.addAll(lessThan);//add all of these to the total array
		total.addAll(EqualTo);
		total.addAll(moreThan);
		return total;
	}

	public int calculatePivot(ArrayList<Integer> tempArray){
		return tempArray.get(tempArray.size() - 1);//work out the pivot
	}
	
	public void generateInOrder(int size){//generates an ordered list
		this.size = size;

		for(int i = 0; i < size; i++){
			sortableArray.add(i);
		}
	}
	
	public void messer(int messes){//randomly changes values
		for(int i = 0; i < messes; i++){
			Random selecter = new Random();
			int tempNumber = selecter.nextInt((5000) + 1);//va;ue to change to 0-5000
			int tempLocation = selecter.nextInt((9999) + 1);//location to change 0-9999
			sortableArray.set(tempLocation, tempNumber);
		}
	}
	
	

}

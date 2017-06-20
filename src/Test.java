import java.util.Arrays;


public class Test {
	

	public static void main(String[] args){
		QuickSort qs = new QuickSort();
		
		qs.generate(10000);//generate an array of this length, random
		qs.startSort(qs.sortableArray);//sort it
		qs.messer(1500);//mess up n values
		long totalTime2 = 0;
		
		for(int i = 0; i < 5; i++){//check the time 5 times over
			long startTime2 = System.nanoTime();
			qs.startSort(qs.sortableArray);//resort the array
			long endTime2 = System.nanoTime();
			totalTime2 = totalTime2 + (endTime2 - startTime2);
		}
		long averageTimeOrder = totalTime2 /5;//finds average
		double secondsOrder = (double)averageTimeOrder / 1000000000.0;//converts to seconds
		System.out.println(secondsOrder);//displays time
		

		
	}
}

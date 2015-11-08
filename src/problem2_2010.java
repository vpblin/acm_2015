import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.PatternSyntaxException;

public class problem2_2010 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 0 7 14 42 18 0 3 41 
		
		/*
		
		0 = 1
		7 = 7 / 41 * 84
		14
		42
		18
		0
		3
		41
		84
		
		*/
		
		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(isreader);
		
		String input = breader.readLine();
		String[] splitArray = null;

		try {
			splitArray = input.split("\\s+");
		} catch (PatternSyntaxException ex) {
		    System.out.println("exception in splitting"); 
		}
		Integer[] sizes = new Integer[8];
		for(int i = 0; i < splitArray.length; i++){
			sizes[i] = Integer.parseInt(splitArray[i]);
		}
		printArr(sizes);
		Integer[] calculatedSizes = new Integer[9];
		calculatedSizes = calculateSizes(sizes);
		printOutput(calculatedSizes);
	}
	
	
	public static Integer[] calculateSizes(Integer[] inputed_sizes){
		Integer[] output = new Integer[9];
		int total = 0;
		int got_total = 0;

		for(int i = 0; i < inputed_sizes.length -1 ; i++){
			total += inputed_sizes[i];
			
		}

		//System.out.println(inputed_sizes[inputed_sizes.length -1]);
		for(int i = 0; i < inputed_sizes.length; i++){
			
			if(((double)inputed_sizes[i]) / ((double)total) != 0){
				output[i] = (int) (((double)inputed_sizes[i]) / ((double)total) * ((double)inputed_sizes[inputed_sizes.length -1]));
			}else{
				output[i] = 1;		
			}
		}
		
		for(int i = 0; i < 7 ; i++){
			got_total += output[i];
			
		}
		
		int diff = inputed_sizes[inputed_sizes.length -1] - got_total;
		if(diff != 0){
			System.out.println("Difference is " + diff);
			output[4] = output[4]  + diff;
		}
		printArr(output);
		return output;
	}
	
	public static void printOutput(Object[] arr){
		System.out.println("Your Output:");
		for(int i = 0; i < 7; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\n++++++++++++++++++++++++++++\n++++++++++++++++++++++++++++");

	}

	public static void printArr(Object[] arr){
		System.out.println("Your Arr:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n++++++++++++++++++++++++++++");

	}

}

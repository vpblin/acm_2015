import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class one_159_three {
	public static LinkedList<Integer> list = new LinkedList();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(isreader);
		String input = breader.readLine();
		int n = Integer.parseInt(input);
		resetList(n);
		
	}
	
	public static void resetList(int n){
		for(int i = 0; i< n; i++){
			
		}
	}

}

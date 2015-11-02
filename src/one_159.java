import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one_159 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(isreader);
		
		String input = breader.readLine();
		int n = Integer.parseInt(input);
		boolean [] taken = new boolean[n];
		for(int o = 0; o < taken.length; o++){
			taken[o] = false;
		}
		taken[0] = true;
		for(int i = 1; i <= n -1; i ++){
			System.out.println("Trying i number : " + i);
			int m = i;
			int last_touched = 0;
			while(!isAllTrue(taken)){
				int left = 1;
				int upper_limit = m;
				while(left != upper_limit){
					if(last_touched + left >= n){
						last_touched = last_touched - n;
					}
					if(taken[last_touched + left] == false){
						left = left + m;
					}else{
						upper_limit = upper_limit + m;
					}

				}
				if(last_touched + left >= n){
					last_touched = last_touched - n;
				}
				taken[last_touched + left] = true;
				last_touched = last_touched + left;
				System.out.println(last_touched);
				
				
				if(taken[13] == true && !isAllTrue(taken)){ // checked 13 without being its turn
					for(int o = 0; o < taken.length; o++){
						taken[o] = false;
						taken[0] = true;
					}
				}
			}
		
		}
		
	}
	
	public static boolean isAllTrue(boolean[] array){
		boolean all_true = true;
		for(int i = 0; i < array.length; i ++){
			if(array[i] == false){
				return false;
			}
		}
		return all_true;
		
	}

}

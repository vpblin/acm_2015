import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class one_159_two {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(isreader);
		LinkedList<Integer> my_list = new LinkedList();
		String input = breader.readLine();
		int n = Integer.parseInt(input);
		
		for(int i = 1; i<= n; i++){
			my_list.add(i);
		}
		
		boolean found = false;
		for(int m = 1; m < n; m++){
			int difference = m;
			System.out.println("m " + m);
			if(!found || my_list.size() == 1){
				my_list = resetList(n, my_list);
				my_list.removeFirst();
				while(my_list.size() > 1){
					print_list(my_list);
					if(difference > my_list.size()){
						difference = difference - my_list.size() - 1;
					}
					System.out.println("elem to remove " + difference);
					int int_poppped = my_list.remove(difference);
					if(int_poppped == 13 && my_list.isEmpty()){
						System.out.println("\n\n\nSolution Found!!!" + m);
						found = true;
						break;
					}else{
						System.out.println("\nPOPPED" + int_poppped);
					}
					difference = difference + difference;
				}
			}
		}
	}
	 public static LinkedList resetList(int n, LinkedList<Integer> my_list){

		 for(int i = 1; i<= n; i++){
				my_list.add(i);
		}
		 return my_list;
	 }
	public static void print_list(LinkedList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			System.out.print(" " + list.get(i));
		}
		
	}

}

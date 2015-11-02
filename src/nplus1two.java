import java.io.*;
import java.util.*;

class nplus1two {
	static int main(String[] args) throws IOException { 
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int first = in.nextInt();
			int second = in.nextInt();
			int current = first;
			int counter = 1;
			int counter_2 = first;
			int max = 0;
			
			while(current <= second){
				while(current != 1){
					if(current % 2 != 0){
						current = 3 * current + 1;
					}else{
						current = current /2;
					}
					counter ++;
				}
				if(counter >= max){
					max = counter;
				}
				current = counter_2 + 1;
				counter_2 = current;
				counter = 1;
			}
			System.out.println(first + " " + second + " " + max);
			
		}
		return 0;
	}
}

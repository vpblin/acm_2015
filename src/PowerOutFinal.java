import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class PowerOutFinal
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		PowerOutFinal my_work = new PowerOutFinal();
		my_work.start();
	}
/*
13
17
99
87
0
 
 */
	void start() throws NumberFormatException, IOException {

		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
	  	
	  	String input = "";

		while (((input = breader.readLine()) != null)) 
		{
			  	int n = Integer.parseInt(input);
			  	
			  	if(n == 0)
			  		break;
			  	else if(n< 13 || n >= 100)
			  	{
			  		System.out.println("Error: Can only process numbers between 13 and 99");
			  	}
			  	else
			  	{
			  		int smallest = findSmallestM(n);
			  		if(smallest == -1)
			  		{
			  			//no value ended in 13
			  			System.out.println("no value ended in 13");
			  		}
			  		else
			  		{
			  			System.out.println(smallest+1);
			  		}
			  	}
			}
		}
		
	private static int findSmallestM(int n)
	{
		boolean [] checked = new boolean[n];
		
		
		if(n == 13) return 0;
		else {
//			System.out.println("starting for loop");
			for(int m = 1; m < n; m++)
			{
//				System.out.println("m = " + m);
				int lastChecked;
				for(int k = 0; k < checked.length; k++)
				{
					checked[k] = false;
//					System.out.print(checked[k] + " ");
				}
//				System.out.println();
				checked[0] = true;
				int tally = 0; 
				int totalChecked = 1;
				int arrayPlacement = 0;
				lastChecked = 0;
				while(totalChecked <= n) {
					if(arrayPlacement == n) arrayPlacement = 0;
					if(totalChecked == n)
					{
						if(lastChecked == 12)
							return m;
						else
							break;
					}
					if(checked[arrayPlacement] == false)
						tally++;
					if(tally == m+1)
					{
						checked[arrayPlacement] = true;
						lastChecked = arrayPlacement;

						tally = 0;
						totalChecked++;
						
					}
					arrayPlacement++;
					
				}
				
			}
		}
		return -1;
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Encryption
{

	public static void main(String[] args)
	{
		try
		{
			InputStreamReader isreader = new InputStreamReader(System.in);
		  	BufferedReader breader = new BufferedReader(isreader);

			String input = breader.readLine();
			String[] splitString = input.split(":"); //split by colon
			String [] splitWord = splitString[0].split("");

			String [][] multi = new String[splitString[0].length()][28];
			for(int k = 1; k < splitWord.length; k++)
			{
				//starts at k-1 because splitWord includes a blank space at location 0
				multi[k-1][0] = splitWord[k];
				char theLetter = splitWord[k].charAt(0);
				int ascii = (int) theLetter;
//				for(int i = 0; i < )
			}
			
						
//			int n = Integer.parseInt(input);

		}
		catch(Exception IOException)
		{
		      System.out.println("File I/O error!");
		}

	}

}

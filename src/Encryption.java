import java.io.BufferedReader;
import java.io.IOException;
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
			
			int a = 97;
			String [] compareArray = new String[27];
			for(int k = 0; k < compareArray.length; k++)
			{
				if(a == 123) a = 32;
				compareArray[k] = Character.toString ((char) a);
//				System.out.println(compareArray[k]);
				a++;
			}
			String [][] multi = new String[splitString[0].length()][27];
			for(int k = 1; k < splitWord.length; k++)
			{
//				System.out.println("k = " + k);
				//starts at k-1 because splitWord includes a blank space at location 0
				multi[k-1][0] = splitWord[k].toUpperCase();
				char theLetter = splitWord[k].charAt(0);
				int ascii = (int) theLetter;
				for(int i = 1; i < multi[k-1].length; i++)
				{
					ascii++;
					if(ascii == 91){
						ascii = 32;
					}
					else if (ascii == 33){
						ascii = 65;
					}
					multi[k-1][i] = Character.toString ((char) ascii);
//					System.out.print(multi[k-1][i]);
				}
			}
			for(int k = 0; k < multi.length; k++){
				for(int i = 0; i < multi[k].length; i++) {
					System.out.print(multi[k][i]);
				}
				System.out.println();
			}
			
			getDecryptedWord(multi, splitString[1]);
		}
		catch(Exception IOException)
		{
		      System.out.println("File I/O error!");
		}

	}
	
	public static void getDecryptedWord(String[][] decryptArr, String key) throws IOException{
		System.out.println("\n\nGina's arr: " );

		for(int i = 0; i < decryptArr[0].length; i++){
			System.out.print(decryptArr[0][i]);
			
		}
		System.out.println("/nGina's arr ^^ /n/n" );

		
		int length = key.length();
		int counter = 0; 
		int previous_counter = 0;

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String[] output = new String[10];
		System.out.println("alphabet " + alphabet);

		InputStreamReader streamReader = new InputStreamReader(System.in);
	  	BufferedReader readInput = new BufferedReader(streamReader);

		String input = readInput.readLine();
		System.out.println("Input " + input);
		while(true){
			String row = "";
			int number_of_chars = Integer.parseInt(key.charAt(counter) + "");
			System.out.println("number_of_chars " + number_of_chars);
			
			for(int j = previous_counter; j < previous_counter + number_of_chars; j++){
				String Char_Found =  input.charAt(j) +"";
				for(int i = 0; i < decryptArr[0].length; i++){
					if(decryptArr[counter][i].equals(Char_Found)){
						System.out.println("decryptArr[counter][i] " + decryptArr[counter][i] + " | Char_Found " +Char_Found + " | i " + i);
						row = row + alphabet.charAt(i);
					}
				}
			}
			System.out.println("row we found : " + row);
			//input = readInput.readLine();
			counter ++;
		}
		
	}


}

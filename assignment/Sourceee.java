package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result1 {

	public static String RemoveOccurances(String str, char C) {
		for(int i=0;i<str.length();i++)//remove First Occurance
		{
			if(str.charAt(i)==C)
			{
				str=str.substring(0, i)+str.substring(i+1);
				break;
			}
		}
		for(int i=str.length()-1;i>-1;i--)//remove Last Occurance
		{
			if(str.charAt(i)==C)
			{
				str=str.substring(0, i)+str.substring(i+1);
				break;
			}
		}
		return str;
		}
	}
public class Sourceee {
	 public static void main(String[] args) throws IOException {
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 String str = bufferedReader.readLine();
	 char C = bufferedReader.readLine().charAt(0);
	String result = Result1.RemoveOccurances(str, C);
	 System.out.print(result);
	bufferedReader.close(); 
	}
}
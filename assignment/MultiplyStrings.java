package assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
class Result
{
	public static String string_multiply(String a,String b)
	{
		BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger result = num1.multiply(num2);
        return result.toString();
	}
}
public class MultiplyStrings {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        String str1 = bufferedReader.readLine();
        String str2 = bufferedReader.readLine();
     String result=Result.string_multiply(str1, str2);
     System.out.println(result);
     bufferedReader.close();
        
        
   }
}
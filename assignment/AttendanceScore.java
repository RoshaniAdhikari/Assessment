package assignment;
import java.util.Scanner;

public class AttendanceScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        int n = scanner.nextInt();
        // Calculate and print the result
        long result = calculateAttendanceScore(n);
        System.out.println(result);
    }
    private static long calculateAttendanceScore(int n) {	
    	int[] dp=new int[n+1];
		dp[0]=1; //combination of holiday
		dp[1]=3;  //presesnt , absent, permisission leave	 	
		for(int i=2;i<dp.length;i++){ 
			dp[i]=dp[i-1];                //2-1=1
			//System.out.println("dp[2]==>"+dp[i]);	
			//System.out.println((int)(1e9 + 7));
			//System.out.println(("******" +((dp[i] + dp[i-1]) % (int)(1e9 + 7))));
			dp[i]=(dp[i] + dp[i-1]) % (int)(1e9 + 7); //2
			//System.out.println(dp[i]);
			dp[i]=(dp[i] + dp[i-1]) %(int)(1e9 + 7);  //3	
			//System.out.println(dp[i]);	   
			} 
		   return dp[dp.length-1];
		}
    }
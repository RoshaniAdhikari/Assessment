package assignment;
@FunctionalInterface
interface Validate
{
	boolean isValid(String firstName,String lastName);
}
public class LambdaUservalidation {//create class as Source
	boolean validate(String username,String password)
	{
		Validate v=(s1,s2)->{
			return (s1.equals("ABC") && s2.equals("DEF"))?true:false;
		};
		return v.isValid(username, password);
	}
public static void main(String[] args) {
	LambdaUservalidation luv=new LambdaUservalidation();//create object of source class
	String uName="Alexa";
	String pass="Alexa@123";
//	String uName="ABC";
//	String pass="DEF";
	System.out.println(luv.validate(uName, pass));
}
}

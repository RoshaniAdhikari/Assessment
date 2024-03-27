package assignment;

import java.util.Scanner;

import iterativestatement.StringAccurance;
class Source{
	
public int countAm(String str)
{
String name=str.toLowerCase();
int count=0;
String a[]=name.split(" ");
for(int i=0;i<a.length;i++)
{
	if(a[i].equals("am"))
	{
		count=count+1;	
	}
}
return count;
}}
class InAmsterdam {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringAccurance sa=new StringAccurance();
	int count=sa.countAm("I am Amsterdam Am am");
	System.out.println(count);
}
}

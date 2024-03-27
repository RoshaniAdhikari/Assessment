package assignment;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfChar {
	public Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> map=new HashMap<Character, Integer>(); 
		for(char c:arr) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				}else{
					map.put(c, 1);
				}
		}
return map;
}
public static void main(String args[])
{
	char[] arr={'a', 'f','c', 'd', 'a', 'c'};
	CountNoOfChar s=new CountNoOfChar();
	Map<Character, Integer> mapl=s.countChars (arr);
	System.out.println(mapl);
}
}
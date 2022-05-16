import java.util.*;

///print unique subsequences of a string
public class RecurssionEx13 {
	public static void subsequences(String str , int index , String newstring,HashSet<String> set) {
		if(index == str.length()) {
			if(set.contains(newstring)) {
				return;
			}
			else {
			System.out.println(newstring);
			set.add(newstring);
			return;
			}
		}
		// to be
		char currentChar=str.charAt(index);
		subsequences(str,index+1,newstring+currentChar,set);
		
		//not to be
		subsequences(str,index+1,newstring,set);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aaa";
		HashSet<String> set = new HashSet<>();
		subsequences(str,0,"",set);
	}

}

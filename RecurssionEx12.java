//print subsequences of a string
public class RecurssionEx12 {

	public static void subsequences(String str , int index , String newstring) {
		if(index == str.length()) {
			System.out.println(newstring);
			return;
		}
		// to be
		char currentChar=str.charAt(index);
		subsequences(str,index+1,newstring+currentChar);
		
		//not to be
		subsequences(str,index+1,newstring);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "abc";
		subsequences(str,0,"");
	}

}

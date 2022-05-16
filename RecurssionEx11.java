// remove duplicate in the string abccdef
public class RecurssionEx11 {
	public static boolean map[]= new boolean[26];
	
	public static void removeDuplicate(String str,int index,String newstring )
	{
		if(index == str.length())
		{
			System.out.println(newstring);
			return;
		}
		char currentChar=str.charAt(index);
		if(map[currentChar -'a'] == true ) {
			removeDuplicate(str,index+1,newstring);
		}
		else {
			newstring +=currentChar;
			map[currentChar -'a']=true;
			removeDuplicate(str,index+1,newstring);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abccddddeeefffgggrrrttt";
		String newstring="";
		removeDuplicate(str,0,newstring);

	}

}

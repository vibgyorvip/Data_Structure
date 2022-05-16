//move all x to the end of string  axbcxxd
public class RecurssionEx10 {

	public static void moveElement(String name , int index ,int count , char element, String newstring )
	{
		if(index == name.length()) {
			for(int i=1;i<=count;i++) {
				newstring+=element;
			}
			System.out.println(newstring);
			return;
		}
		char currentChar=name.charAt(index);
		if(currentChar == element) {
			count ++;
			moveElement(name,index+1,count,element,newstring);
		}
		else {
			newstring += currentChar;
			moveElement(name,index+1,count,element,newstring);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="axbcxxd";
		String newstring="";
		char element='x';
        moveElement(name,0,0,element,newstring);
	}

}

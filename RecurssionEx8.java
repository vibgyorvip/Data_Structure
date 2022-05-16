// find the 1st and last occurance of an element in the string.
public class RecurssionEx8 {

	public static int first=-1;
	public static int last=-1;
	public static void findOccurance(String name, int index ,char element) {
		if(index == name.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentElement=name.charAt(index);
		if(currentElement == element) {
			if(first ==-1) {
				first=index;
			}else {
				last=index;
			}
		}
		
		findOccurance(name,index+1,element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="abbbabbanhdgajjjda";
		findOccurance(name,0,'a');
	}

}

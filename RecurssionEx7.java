
public class RecurssionEx7 {

	// reverse the string by using recursion
	public static void reverseString(String name , int index) {
		if(index ==0) {
			System.out.print(name.charAt(index));
			return;
		}
		System.out.print(name.charAt(index));
		reverseString(name,index-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello";
		int index=name.length()-1;
		
		for(int i=index;i>=0;i--)
		{
			//without recursion==> by looping reversing the string
			System.out.print(name.charAt(i));
		}
		System.out.println();

		//recursion funtcion calling
		reverseString(name,index);
	}

}

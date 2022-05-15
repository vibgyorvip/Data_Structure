
public class RecurssionEx1 {
	//printing number from 5 to 1
	public static void printNumber(int num) {
		if(num ==0)
		{
			return;
		}
		
		System.out.println(num);
		printNumber(num-1);
		
	}
	//printing number from 1 to 5
	public static void printNum(int num) {
		if(num ==6)
		{
			return;
		}
		
		System.out.println(num);
		printNum(num+1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =5;
		printNumber(number);
		number=1;
		printNum(number);
		
	}

}

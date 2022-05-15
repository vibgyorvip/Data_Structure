//fibonacci series
public class RecurssionEx4 {
	public static void printFib(int num1, int num2 ,int num) {
		if(num ==0)
		{
			return;
		}
		int temp=num1+num2;
		System.out.println(temp);
		printFib(num2,temp,num-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		int num=5;
		printFib(num1,num2,num-2);
	}

}

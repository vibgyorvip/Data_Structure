//print sum of n natural numbers
public class RecurssionEx2 {

	public static void sumNum(int i ,int number , int sum)
	{
		if(i==number)
		{	sum+=i; //sum =sum +i;
			System.out.println(sum);
			return;
		}
		
		sum= sum+i;
		sumNum(i+1,number,sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumNum(1,5,0);
		
	}

}

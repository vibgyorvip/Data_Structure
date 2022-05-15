//power of an element
public class RecurssionEx5 {

	public static int calcPower(int x , int n) { //n stack height
		if(n ==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		
		int temp=calcPower(x,n-1);
		return x*temp;
		
	}
	public static int calcPowerr(int x , int n) { //logn stack height
		if(n ==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		
		if(n %2 ==0)
		{  //even power
			return calcPowerr(x,n/2)*calcPowerr(x,n/2);
		}
		else {
			//odd power
			return calcPowerr(x,n/2)*calcPowerr(x,n/2)*x;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int n=5;
		int ans=calcPower(x,n);
		System.out.println(ans);
		System.out.println(calcPowerr(x,n));
	}

}

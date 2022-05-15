//factorial of a number
public class RecurssionEx3 {

	public static int fact(int number) {
		if(number==1 || number==0) {
			return 1;
		}
		return number*fact(number-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(4));
	}

}

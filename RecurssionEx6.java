
public class RecurssionEx6 {

	public static void towerOfHanoi(int number , String src, String helper, String dest) {
		if(number==1)
		{
			//base condition
			System.out.println("Disk Transfered "+number+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(number-1,src,dest,helper);
		System.out.println("Disk Transfered "+number+" from "+src+" to "+dest);
		towerOfHanoi(number-1,helper,src,dest);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=3;
		towerOfHanoi(number,"s","h","d");
	}

}

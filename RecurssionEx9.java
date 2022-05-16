//check if array is sorted or not? 1 2 3 4 5
public class RecurssionEx9 {

	public static boolean isArraySorted(int arr[],int index ) {
		if(index ==arr.length-1) {
			return true;
		}
		if(arr[index] < arr[index+1])
		{
			//array is sorted now
			return isArraySorted(arr,index+1);
			
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		System.out.println(isArraySorted(arr,0));
	}

}

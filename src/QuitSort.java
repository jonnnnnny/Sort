import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class QuitSort {

	public static void main(String[] args) {
		int[] a= {13,14,25,12,6,24,4,72,23,67,2,82,44,34,53};
		System.out.println("before sort: ");
		System.out.println(Arrays.toString(a));
		quick(a);
		System.out.println("after sort:");
		System.out.println(Arrays.toString(a));
	}

	private static void quick(int[] a) {
		// TODO Auto-generated method stub
		if (a.length> 0) {
			quickSort(a,0,a.length-1);
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (low<high) {
			int middle=getMiddle(a,low,high);
			quickSort(a, 0, middle);
			quickSort(a, middle+1, high);
		}
	}

	private static int getMiddle(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int tmp=a[low];
		while(low<high){
			while(low<high && a[high]>=tmp){
				high--;
			}
			a[low]=a[high];
			while(low<high && a[low]<=tmp){
				low++;
			}
			a[high]=a[low];
		}
		a[low]=tmp;
		return low;
		
	}
}

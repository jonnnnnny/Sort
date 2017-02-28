import java.util.Arrays;



public class HeapSort {

	public static void main(String[] args) {
		int[] a= {13,14,25,12,6,24,4,72,23,67,2,82,44,34,53};
		int arrayLength=a.length;
		
		
		
		for(int i=0;i<arrayLength-1;i++){
			buildMaxHeap(a,arrayLength-1-i);
			swap(a, 0, arrayLength-1-i);
			System.out.println(Arrays.toString(a));
			
		}
	}

	private static void buildMaxHeap(int[] a, int lastIndex) {
		// TODO Auto-generated method stub
		for (int i = lastIndex/2; i >=0; i--) {
			int k=i;
			while(k*2+1<=lastIndex){
				int biggerIndex=2*k+1;
				if (biggerIndex<lastIndex) {
					if (a[biggerIndex]<a[biggerIndex+1]) {
						biggerIndex++;
					}
				}
				if (a[k]<a[biggerIndex]) {
					int temp=a[k];
					a[k]=a[biggerIndex];
					a[biggerIndex]=temp;
					k=biggerIndex;
				}else{
					break;
				}
			}
			
		}
		
	}
	private static void swap(int[] a,int i, int j) {
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}

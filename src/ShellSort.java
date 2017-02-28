
public class ShellSort {

	public static void main(String[] args) {
		int[] a= {13,14,25,12,6,24,4,72,23,67,2,82,44,34,53};
		System.out.println("before Sort: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int d=a.length;
		while(true){
			d=d/2;
			for(int x=0;x<d;x++){
				for(int i=x+d;i<a.length;i=i+d){
					int temp=a[i];
					int j;
					for(j=i-d;j>=0 && a[j]>temp;j=j-d){
						a[j+d]=a[j];
					}
					a[j+d]=temp;
				}
			}
			if (d==1) {
				break;
			}
		}
		System.out.println();
		System.out.println("after sort: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
			
		}
	}
}

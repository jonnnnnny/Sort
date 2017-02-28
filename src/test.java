import java.lang.reflect.Method;

public class test {

	public static void main(String[] args) {
		HeapSort heapSort = new HeapSort();
		printClassMethod(heapSort);
		Class class1=heapSort.getClass();
//		Method method=class1.getDeclaredMethod("buildMaxHeap", int.class,int.class)
	   
	}
	public static void printClassMethod(Object obj) {
		Class class1=obj.getClass();
		
	
		Method[] methods=class1.getDeclaredMethods();
		for (Method method : methods) {
			
			System.out.println(method);
		}
		System.out.println(class1);
	}
}

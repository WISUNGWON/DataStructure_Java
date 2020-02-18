package practice.coding;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	public boolean add(int index, Object element) {
		
		for(int i = size-1; i>=index; i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}
	
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str = str + elementData[i];
			if (i < size-1) {
				str = str + ",";
			}
		} 
		return str + "]";

	
	
 }
}
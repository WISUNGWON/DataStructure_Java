package list.arraylist.implementation;


public class ArrayList {
	private int size = 0; 
	private Object[] elementData = new Object[100];

	public boolean addLast(Object element) {
		elementData[size] = element; 
		size++;
		return true;
		
	}
	
	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
		
	}
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	

	
	public Object remove(int index) {
		Object removed = elementData[index]; 
		for (int i = index; i < size-1; i++) {
			elementData[i] = elementData[i+1];
		}
		elementData[size-1] = null;
		size--;
		return removed;
		
	}
	
	public Object removeFirst() {
		return remove(0); //return이 remove(0)의 내부까지 return 한다고 복잡하게 생각하지말고, 그냥 remove(0)을 실행시킨다고 생각해라.
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
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

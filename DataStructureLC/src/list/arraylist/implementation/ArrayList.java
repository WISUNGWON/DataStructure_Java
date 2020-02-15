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
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element){
		for (int i = 0; i <= size-1; i++) {
			if (element.equals(elementData[i])) {
				return i;
			}
			
		}
		return -1; 	
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
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex = 0;
		public Object next() {
			return elementData[nextIndex++];
	//		Object returnData = elementData[nextIndex];
	//		nextIndex++;
	//		return returnData;
			/*리턴하려는 값은 ListIterator의 부모 클래스인 ArrayList의 elementData[]의 특정한 인덱스에 담겨있음
			 * 특정한 인덱스를 어떻게 결정하는가? next()가 호출될때마다 elementData[nextIndex]에 들어가는 nextIndex값이 0부터 시작해서 1씩 증가하게 된다면 
			 * 우리는 elementData[]에 담겨있는 값들은 next()가 호출할 때마다 순차적으로 하나씩 꺼내서 리턴할 수 있음.
			*/
			
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public Object previous() {
			return elementData[--nextIndex];
		}
		
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			//next()를 실행한 순간 nextIndex는 다음 index를 가르키고 있기 떄문에
			//next()실행 이후 현재 자료를 삭제하고 싶으면 nextIndex-1을 해주어야 한다.
			nextIndex--;
		}
		
		
	}

}

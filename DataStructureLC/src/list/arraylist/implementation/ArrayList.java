package list.arraylist.implementation;

//ArrayList를 실제로 구현 
// Array + List : List를 만들때 내부적으로 Array를 사용 
public class ArrayList {
	private int size = 0; // 배열에 저장되는 값의 수를 check하기 위해 내부적으로 변수 선언
	private Object[] elementData = new Object[100]; // 객체 내부적으로 사용할 data
	/*
	 * Object datatype의 배열을 생성해서 elementData라고 하는 private접근자를 갖고 있는 instance변수에 할당
	 * 그리고 그 배열의 크기는 100임. 실제 라이브러리에 포함된 ArrayList보다는 기능이 떨어짐 
	 * Java에서 제공하는 ArrayList는 크기를 늘려주는 형식으로 코딩이 되어 있기 때문에 기능의 걱정을 하지 않아도 됨. (Array의본질은 아니지만, 
	 * 편의를 위해 해당 기능을 코딩함)
	 */
	
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
	


	/*	public String toString() {
		return "TEST";
		}
	 * toString이라고 하는 약속 되어 있는 메서드를 구현하면, sysout으로 출력 했을 때 메서드에 작성한 TEST가 출력 됨. 
	 * 이렇게 출력 되는 이유는 toString이라고 하는 것을 ArrayList 클래스에 직접 구현하면, numbers라는 객체를 문자로 출력해야하는 상황에서
	 * toString이라고하는 약속되어 있는 이름의 메서드가 호출되도록 약속이 되어있기 때문(약속이란?). 그것을 구현하게 되면 사람이 보기 편한 형태도 출력 됨(여기서는 "TEXT"로 구현함 따라서 TEXT가 문자로 출력).
	 */
	
	//따라서 toString을 직접 구현하여 원하고자 하는 출력 값을 얻는다. 밑의 메서드는 numbers의 element들을 정해진 형식에 맞추어 출력 할 수 있도록 하는 toString()
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
	/*
	 * toString을 직접구현하는 것을 통해 현재 리스트의 상태가 어떠한지를 쉽게 파악할 수 있는 메서드를 추가 했음.
	 */
}

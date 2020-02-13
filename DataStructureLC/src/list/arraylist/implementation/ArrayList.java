package list.arraylist.implementation;

//ArrayList�� ������ ���� 
// Array + List : List�� ���鶧 ���������� Array�� ��� 
public class ArrayList {
	private int size = 0; // �迭�� ����Ǵ� ���� ���� check�ϱ� ���� ���������� ���� ����
	private Object[] elementData = new Object[100]; // ��ü ���������� ����� data
	/*
	 * Object datatype�� �迭�� �����ؼ� elementData��� �ϴ� private�����ڸ� ���� �ִ� instance������ �Ҵ�
	 * �׸��� �� �迭�� ũ��� 100��. ���� ���̺귯���� ���Ե� ArrayList���ٴ� ����� ������ 
	 * Java���� �����ϴ� ArrayList�� ũ�⸦ �÷��ִ� �������� �ڵ��� �Ǿ� �ֱ� ������ ����� ������ ���� �ʾƵ� ��. (Array�Ǻ����� �ƴ�����, 
	 * ���Ǹ� ���� �ش� ����� �ڵ���)
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
	 * toString�̶�� �ϴ� ��� �Ǿ� �ִ� �޼��带 �����ϸ�, sysout���� ��� ���� �� �޼��忡 �ۼ��� TEST�� ��� ��. 
	 * �̷��� ��� �Ǵ� ������ toString�̶�� �ϴ� ���� ArrayList Ŭ������ ���� �����ϸ�, numbers��� ��ü�� ���ڷ� ����ؾ��ϴ� ��Ȳ����
	 * toString�̶���ϴ� ��ӵǾ� �ִ� �̸��� �޼��尡 ȣ��ǵ��� ����� �Ǿ��ֱ� ����(����̶�?). �װ��� �����ϰ� �Ǹ� ����� ���� ���� ���µ� ��� ��(���⼭�� "TEXT"�� ������ ���� TEXT�� ���ڷ� ���).
	 */
	
	//���� toString�� ���� �����Ͽ� ���ϰ��� �ϴ� ��� ���� ��´�. ���� �޼���� numbers�� element���� ������ ���Ŀ� ���߾� ��� �� �� �ֵ��� �ϴ� toString()
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
	 * toString�� ���������ϴ� ���� ���� ���� ����Ʈ�� ���°� ������� ���� �ľ��� �� �ִ� �޼��带 �߰� ����.
	 */
}

package java.basic;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] array4 = new int[3][4]; // 2���� �迭 ����
		array4[0][1] = 10; // 2���� �迭�� �� �ֱ�
		
		int[][] array5 = new int[3][]; // ���� ���� ������ Ÿ�Ը� �����ϴ� �迭 ���� 
		
		//array5[0][0] = 10; array5 �����ÿ� ���� ũ�⸦ ������ ���� �ʾұ�  ������ ���� �߻� 
		
		int[][] array6 = new int[3][];  // ���� ũ�⸦ ó���� �������� �ʰ�, �� �ึ�� �پ��� ���� ũ�⸦ ���� 2���� �迭 ����
		array6[0] = new int[1];
		array6[0] = new int[2];
		array6[0] = new int[3];
		
		int[][] array7 = {{1}, {1, 2}, {1,2,3}}; //����� ���ÿ� �ʱ�ȭ 
		
		System.out.println(array7[0][0]); //2���� �迭�� ���
		System.out.println(array7[2][2]); 
		
		//2���� �迭�� ��ģ������ ������ �迭��, �迭�� ũ�⸸ �������Ѽ� ����ϸ� �ȴ�. 
	}
	

}

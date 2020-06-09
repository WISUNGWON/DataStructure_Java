package java.basic;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] array4 = new int[3][4]; // 2차원 배열 생성
		array4[0][1] = 10; // 2차원 배열에 값 넣기
		
		int[][] array5 = new int[3][]; // 행의 값의 데이터 타입만 설정하는 배열 생성 
		
		//array5[0][0] = 10; array5 생성시에 열의 크기를 설정해 주지 않았기  떄문에 에러 발생 
		
		int[][] array6 = new int[3][];  // 열의 크기를 처음에 지정하지 않고, 각 행마다 다양한 열의 크기를 갖는 2차원 배열 생성
		array6[0] = new int[1];
		array6[0] = new int[2];
		array6[0] = new int[3];
		
		int[][] array7 = {{1}, {1, 2}, {1,2,3}}; //선언과 동시에 초기화 
		
		System.out.println(array7[0][0]); //2차원 배열의 출력
		System.out.println(array7[2][2]); 
		
		//2차원 배열과 마친가지로 다차원 배열도, 배열의 크기만 증가시켜서 사용하면 된다. 
	}
	

}

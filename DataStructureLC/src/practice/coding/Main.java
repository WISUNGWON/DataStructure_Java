package practice.coding;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = new int[commands.length];
		
		
		for (int i = 0; i < commands.length; i++) {
			int[] numArr = commands[i];
			int[] sliceArr = new int[numArr[1] - numArr[0] + 1];
			int cut = 0;
			for (int j = numArr[0] - 1; j < numArr[1]; j++) {
				sliceArr[cut] = array[j];
				cut++;
				
			}
			Arrays.sort(sliceArr);
			result[i] = sliceArr[numArr[2] - 1 ];
		}
		
		System.out.println(Arrays.toString(result));
		

		//copyOfRange(arr, n1, n2) 이용해서 구현하기
	}

}

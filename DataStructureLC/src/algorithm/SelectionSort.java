package algorithm;

import java.util.Scanner;

public class SelectionSort {
    
    static int min, index, temp;
    static int[] array = new int[10];
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {;
        
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            min = 9999;
            for (int j = i; j < 10; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
        
        temp = array[i];
        array[i] = array[index];
        array[index] = temp;
        }
        
        for (int i = 0; i < 10; i ++) {
            System.out.printf("%d ", array[i]);
        }
        
        sc.close();
    }
    
}

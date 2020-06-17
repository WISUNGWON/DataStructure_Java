package algorithm;

public class InsertionSort {

    public static void main(String[] args) {
        int i, j, temp;
        int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (i = 0; i < 9; i++) {
            j = i;
            while (j >= 0 && array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.printf("%d ", array[i]);
        }
        
    }

}

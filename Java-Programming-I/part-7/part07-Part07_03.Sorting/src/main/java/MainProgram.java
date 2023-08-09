import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if(number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        } 
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        } 
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tempFirst = array[index1];
        array[index1] = array[index2];
        array[index2] = tempFirst;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == array[MainProgram.indexOfSmallestFrom(array, i)])) {
                MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
            }
        }
    }
}

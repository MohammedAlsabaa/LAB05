import java.util.Arrays;

public class Sorter{

    public static void main(String[] args) {
        int[] data = { 28, 15, 6, 3, 17 };
        Sorter ss = new Sorter();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
        }
        void selectionSort(int array[]) {
            int size = array.length;
        
            for (int step = 0; step < size - 1; step++) {
              int min_idx = step;
        
              for (int i = step + 1; i < size; i++) {
        
                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                  min_idx = i;
                }
              }
        
              // put min at the correct position
              int temp = array[step];
              array[step] = array[min_idx];
              array[min_idx] = temp;
            }
          }


          void insertionSort(int array[]) {
            int size = array.length;
        
            for (int step = 1; step < size; step++) {
              int key = array[step];
              int j = step - 1;
        
              // Compare key with each element on the left of it until an element smaller than
              // it is found.
              // For descending order, change key<array[j] to key>array[j].
              while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
              }
        
              // Place key at after the element just smaller than it.
              array[j + 1] = key;
            }
          }
          public static void sort2(String args[]) {
            int[] data = { 9, 5, 1, 4, 3 };
            Sorter is = new Sorter();
            is.insertionSort(data);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
          }


        }
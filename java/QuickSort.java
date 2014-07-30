/*Quicksort.java*/
/*Java*/
/*https://github.com/jonstaff/JavaDataStructures/blob/master/src/com/jonstaff/java/sort/QuickSort.java*/

public class QuickSort {

    public static void sort(int[] list, int first, int last) {
        if (first >= last) return;

        int pivot = partition(list, first, last);

        sort(list, first, pivot);
        sort(list, pivot + 1, last);
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        while (first < last) {

            while (list[first] < pivot) {
                first++;
            }

            while (list[last] > pivot) {
                last--;
            }

            swap(list, first, last);
        }

        return first;
    }

    public static void swap(int[] list, int x, int y) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
}

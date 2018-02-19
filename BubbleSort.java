
/**
 * Implements Bubble Sort algorithm. Worst Case Complexity: O(n^2)
 *
 * @author apokhr3
 */
public class BubbleSort {

    /**
     *
     * @param list List of numbers to be sorted
     */
    public static void sort(int[] list) {
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

            }
        }
    }
}

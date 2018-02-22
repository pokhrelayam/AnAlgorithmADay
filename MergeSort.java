/**
 *  Implements Merge Sort Algorithm. Complexity: O(nlogn)
 *
 * @author ayam
 */
public class MergeSort {

    /**
     * Temporary array to hold the intermediate list
     */
    private static int[] tempList;

    /**
     *
     * @param list The list of unsorted numbers
     */
    public static void sort(int[] list) {
        tempList = new int[list.length];
        mergeSort(list, 0, list.length - 1);

    }

    /**
     * Breaks the problem into smaller parts, and recursively calls itself for
     * the smaller parts. 
     * If the size of the input list is 1, it is obviously already sorted.
     * @param list The list of unsorted numbers -- or -- the sub-array
     * @param low The lowest index of the sub-array
     * @param high The highest index of the sub-array
     *
     */
    public static void mergeSort(int[] list, int low, int high) {

        if (high > low) {
            int mid = (high + low) / 2;                     // Left sub-array may have 1 more number than the right sub-array
            mergeSort(list, low, mid);
            mergeSort(list, mid + 1, high);
            merge(list, low, high, mid);
            
        }
        // If high<=low, it just returns doing nothing. This is the base case.

    }

    /**
     *
     * @param list The list containing two sub-lists
     * @param low The lowest index of the sub-array
     * @param high The highest index of the sub-array
     * @param mid The mid index which divides the sub-array
     */
    public static void merge(int[] list, int low, int high, int mid) {

        /* 
         * Can replace this 'for loop' with either of the following: 
         * tempList=Arrays.copyOf(list, list.length);
         * System.arraycopy(list, 0, tempList, 0, list.length);
         */
        for (int i = 0; i < list.length; i++) {
            tempList[i] = list[i];
        }
        
        int i = low, currentPosition = low, j = mid + 1;

        // Two sub-arrays are already sorted. So, we need to merge the two sorted subarrays
        while (j <= high && i <= mid) {
            if (tempList[i] < tempList[j]) {
                list[currentPosition] = tempList[i];
                i++;

            } else {
                list[currentPosition] = tempList[j];
                j++;
            }
            currentPosition++;
        }

        //We need to copy the remaining. 
        while (i <= mid) {
            list[currentPosition] = tempList[i];
            currentPosition++;
            i++;
        }
        while (j <= high) {
            list[currentPosition] = tempList[j];
            currentPosition++;
            j++;
        }
        //System.err.println("low = "+low+ " ,Mid = "+mid+" ,High = "+high+"\t" + Arrays.toString(tempList)+"\t"+Arrays.toString(list)+"\t");
        
    }

}

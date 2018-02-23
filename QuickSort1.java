/**
 *  Implements Quick Sort Algorithm. End element (rightmost element) is selected as pivot. (Lomuto partition scheme)
 *  Complexity: Best/Average Case -> O(nlogn), Worst Case - O(n^2)
 *  In the worst case, this algorithm works like the Selection Sort - sorting one position at a time - starting from the right
 * 
 *  @author ayam
 */
public class QuickSort1 {

  
    /**
     *
     * @param list The list of unsorted numbers
     */
    public static void sort(int[] list) {
       
        quickSort(list, 0, list.length - 1);
    }

    /**
     * This method breaks the problem into smaller parts, and recursively calls itself for
     * the smaller parts. For each sub-array, pivot point is found. Numbers left to
     * the pivot point should be less than pivot and numbers to the right should be 
     * greater than the pivot. 
     * @param list  The list of unsorted numbers -- or -- the sub-array
     * @param low   The lowest index of the sub-array
     * @param high  The highest index of the sub-array
     */
    public static void quickSort(int[] list, int low, int high) {
        
        if(low<high){
            int pivotIndex = getPivotIndex(list,low,high);
            quickSort(list,low, pivotIndex-1);
            quickSort(list,pivotIndex+1, high);
        }
        
    }

    /** This method partitions the list into two parts which are separated by the pivot. 
     *  Initially, the rightmost element is selected as the pivot. Then, its 
     *  correct position is found and returned. 
     *  The sub-array is re-arranged in such a way that 
     *  the numbers to the left side of the pivot are always less than the pivot (not necessarily in order).
     *  QuickSort works the best when the pivot is always almost at the middle.
     * 
     * @param list  The list of unsorted numbers -- or -- the sub-array 
     * @param low   The lowest index of the sub-array
     * @param high  The highest index of the sub-array
     * @return      The correct position of the pivot, an integer.
     */
    
    public static int getPivotIndex(int[] list, int low, int high) {

       // high is the index of pivot at the beginning
       int pivot = list[high];
       int lastSmallNumIdx=low-1;
       int temp;
       
       //All the smaller elements are moved to the left. When done, pivot is added in the next position. 
       for(int i=low;i<=high;i++){
           
           if(list[i]<pivot){
               lastSmallNumIdx++;
               temp=list[lastSmallNumIdx];
               list[lastSmallNumIdx]=list[i];
               list[i]=temp;
           }
         
       }
       
       temp = list[lastSmallNumIdx+1];
       list[lastSmallNumIdx+1]=list[high];
       list[high]=temp;
       
       return lastSmallNumIdx+1; 
    }

}
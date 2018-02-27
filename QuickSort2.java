/**
 *  Implements Quick Sort Algorithm. Median of 3 numbers is selected as the pivot. 3 numbers are taken from the two ends and the middle.
 *  Complexity: Best/Average Case -> O(nlogn), Worst Case - O(n^2)
 *   
 *  @author ayam
 */
public class QuickSort2 {

  
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
     *  Initially, the the median of 3 numbers is selected as the pivot. Then, its 
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

       //Initially, the median of 3 numbers (left end, right end, and middle) is selected as the pivot.
       
       int pivotIdx=medianIdx(list,low,high);
       
       //System.err.println(pivotIdx);
       int pivot = list[pivotIdx];
       int lastSmallNumIdx=low;
       
       
       //All the smaller elements are moved to the left. When done, pivot is added in the next position. 
       for(int i=low;i<=high;i++){
           if(list[i]<=pivot && i!=pivotIdx){
               swap(list, i, lastSmallNumIdx);
               if(lastSmallNumIdx==pivotIdx)pivotIdx=i;
               lastSmallNumIdx++;
           }
       }
       
       swap(list,pivotIdx,lastSmallNumIdx);
       return lastSmallNumIdx; 
    }
    
    /**
     * This method swaps two numbers within an array
     * @param list  The list where swapping is done
     * @param i The index of the first number
     * @param j The index of the second number
     */
    public static void swap(int[] list, int i, int j){
        int temp;
        temp=list[i];
        list[i]=list[j];
        list[j]=temp;
    }
    
    /**
     * 
     * @param list  The list of unsorted numbers -- or -- the sub-array 
     * @param low   The lowest index of the sub-array
     * @param high  The highest index of the sub-array
     * @return The index of the median of three numbers -- numbers at the two ends and the number at the middle
     */
    public static int medianIdx(int[] list,int low, int high){
        int mid = (low+high)/2;
        if(list[low]>list[mid]){
            if(list[mid]>list[high]){
                return mid;
            }
            else{
                if(list[low]>list[high]){
                    return high;
                }
                else{
                    return low;
                }
            }
        }
        else{
            if(list[high]>list[mid]){
                return mid;
            }
            else{
                if(list[low]>list[high]){
                    return low;
                }
                else{
                    return high;
                }
            }
        }
        
    }

}
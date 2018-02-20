
import java.util.Arrays;

/**
 * Implements Selection Sort algorithm. Worst case running time: O(n^2)
 * @author ayam
 */
public class SelectionSort {
    
    /**
     * 
     * @param list The list of unsorted numbers
     */
    public static void sort(int[] list){
        // Selection Sort has two parts: Sorted Part and the Unsorted Part
        int selectedWorkingPosition;  // Min Position (Current Position in the SORTED Part)
        int currentMinIndex;
        int currentMinimum;
        int temp;
        for(int i=0; i<list.length;i++){
            selectedWorkingPosition = i;
            currentMinIndex=i;
            currentMinimum= list[currentMinIndex];
            for(int j =i+1; j<list.length;j++){
                if(currentMinimum>list[j]){
                    currentMinimum =list[j];
                    currentMinIndex=j;
                }
            }
            temp = list[selectedWorkingPosition];
            list[selectedWorkingPosition]=list[currentMinIndex];
            list[currentMinIndex]=temp;
        }
        
    }
    
}

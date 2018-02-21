/**
 * Implements Insertion Sort algorithm. Complexity: Worst Case -> O(n^2), Best Case -> O(n) (if the list is already sorted)
 * Assumption: The numbers are considered as cards here for easiness  
 * @author apokhr3
 */
public class InsertionSort {

    /**
     *
     * @param list List of cards to be sorted
     */
    public static void sort(int[] list) {
        int newPickedUpCard;
        int j;
        for (int i = 1; i < list.length; i++) {         // i starts from 1 because the first card is already sorted
            newPickedUpCard = list[i];                  // Card at i is the most recently picked up card   
            j=i-1;                                      // Most recently picked up card is compared with other cards to its left  
                                                  
            while(j>=0 && newPickedUpCard < list[j]){   // Keep on comparing the most recently picked up card with the cards to its left until the right spot is found
                                                        // Also, move the higher cards to the right by one position             
               list[j+1]=list[j];
               j--;                        
            }
            list[j+1]=newPickedUpCard;                  // Move the newPickedUpCard to its correct position

            
        }
    }
}

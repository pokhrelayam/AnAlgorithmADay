
import java.util.Arrays;


/**
 *
 * @author apokhr3
 */
public class SortClient {
        public static void main(String...args){
            int[] list = {7,5,4,9,2,1,3,6,8};
            //int[] list = {7,6,5,4,3,2,1};
            //int[] list = {1,1,1,1,1,1,1,1};
            //int[] list = {1,2,3,4,5,6,7,8};
            
            System.out.println(Arrays.toString(list));
            //BubbleSort.sort(list);
            //SelectionSort.sort(list);
            InsertionSort.sort(list);
            System.out.println(Arrays.toString(list));
            
        }
}

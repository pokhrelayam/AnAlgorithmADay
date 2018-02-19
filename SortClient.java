
import java.util.Arrays;


/**
 *
 * @author apokhr3
 */
public class SortClient {
        public static void main(String...args){
            int[] list = {7,5,4,9,2,1,3,6,8};
            System.out.println(Arrays.toString(list));
            BubbleSort.sort(list);
            System.out.println(Arrays.toString(list));
            
        }
}


import java.util.Arrays;


/**
 *
 * @author apokhr3
 */
public class SortClient {
        public static void main(String...args){
            // Sorting
			
			int[] list = {7,5,4,9,2,1,3,6,8};
            //int[] list = {7,6,5,4,3,2,1};
            //int[] list = {1,1,1,1,1,1,1,1};
            //int[] list = {1,2,3,4,5,6,7,8};
            
            System.out.println(Arrays.toString(list));
            //BubbleSort.sort(list);
            //SelectionSort.sort(list);
            //InsertionSort.sort(list);
			MergeSort.sort(list);	
            System.out.println(Arrays.toString(list));
            
			// Tree Operation
			/*
			 *						 10
			 *						/  \
			 *					  7     15
			 *					 / \   /  \
			 *                  6   8 12   18
			 *  		 					
			 * 
			 * 
			*/
			
			BinarySearchTree bst = new BinarySearchTree();
			bst.insert(10);
			bst.insert(7);
			bst.insert(15);
			bst.insert(12);
			bst.insert(6);
			bst.insert(8);
			bst.insert(18);
			bst.levelOrderTraversal();
			System.out.println(bst.toList());
			BinarySearchTree bst2 = new BinarySearchTree(bst.toList());
			bst2.levelOrderTraversal();
			
			
        }
}

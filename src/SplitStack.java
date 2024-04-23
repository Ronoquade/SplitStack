import java.util.Stack;
/**Class: SplitStack
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 21, 2024
 *
 * This class tests the splitStack method.
 */
public class SplitStack {
    public static void splitStack(Stack<Integer> integers) {

        Stack output = new Stack<Integer>();

        // Auxiliary Storage for non-negative integers
        Stack nonNegativeStorage = new Stack<Integer>();

        // Sorting integers in each stack
        while ( !integers.isEmpty() ) {
            if (integers.peek() < 0) {
                output.push(integers.pop());
            }
            else if (integers.peek() >= 0) {
                nonNegativeStorage.push(integers.pop());
            }
        }

        // Adding the non-negative integers to the top of the stack
        while (!nonNegativeStorage.isEmpty()) {
            output.push(nonNegativeStorage.pop());
        }
        // Printing out the split stack
        System.out.println(output);

    }
    // Main Method
    public static void main(String[] args) {
        Stack<Integer> ints = new Stack<>();

        Stack<Integer> ints2 = new Stack<>();

        Stack<Integer> ints3 = new Stack<>();

        int[] nums1 = {5,-5,67,-45,67,9,0,-42,56,-7};
        int[] nums2 = {1,-2,-3,4,-5,6,-7,8,9};
        int[] nums3 = {4,-54,23,5345,232,-8645,54,2,-65,33,-213,23,-124};

        for (int i = 0; i < nums1.length; i++) {
            ints.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            ints2.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            ints3.add(nums3[i]);
        }
        splitStack(ints);
        splitStack(ints2);
        splitStack(ints3);
    }
}
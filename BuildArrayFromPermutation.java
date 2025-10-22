// https://leetcode.com/problems/build-array-from-permutation/
/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for
each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] < nums.length
    The elements in nums are distinct.

Example 1:
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     = [0,1,2,4,5,3]
 */
package Array;
import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];                                                                               //Array Declaration

        System.out.println("Enter elements in array");
        for (int i = 0; i < size; i++) {                                                                           //Array Initialisation
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int ans[] = new int[arr.length];                                                                      // creating another array of same length as arr.
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];                                                                                  //Storing the values of arr[arr[i]] in array ans[].
        }return ans;
    }
}

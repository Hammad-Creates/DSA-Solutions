/*
Given an array arr[], the task is to print every alternate element of the array starting from the first element.
Input: arr[] = [10, 20, 30, 40, 50]
Output: 10 30 50
Explanation: Print the first element (10), skip the second element (20), print the third element (30),
                  skip the fourth element(40) and print the fifth element(50).
 */
package Array;
import java.util.Scanner;

public class Alternate_elements{
    static void alternate(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if(i%2==0){
//                System.out.print(arr[i]+" ");
//            }
//        }
//                                                  or
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        alternate(arr);
    }
}

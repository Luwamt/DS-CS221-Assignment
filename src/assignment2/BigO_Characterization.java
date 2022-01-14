package assignment2;

public class BigO_Characterization {

    /**
     * Question-1
     * Code Fragment 1, example 1
     *  This is O(n).
     * Because the running time for the loop growth rate is linear in proportion to n.
     */
    public static int example1(int [] arr){
        int n = arr.length ,   total =0;
        for (int i = 0; i < n; i++) // loop from 0 to n-1
            total+=arr[i];
        return total;
    }
    /**
     * Question-2
     * Code Fragment1, example 2
     *  This is O(n),
     *  Because the running time for the loop growth rate is linear in proportion to n.
     */
    public static int example2(int [] arr){
        int n = arr.length ,   total =0;
        for (int i = 0; i < n; i+=2) //note the increment of 2
            total+=arr[i];
        return total;
    }

    /**
     * Question-3
     * Code Fragment1,  example 3
     * This is O(n^2)
     * Because the running time for the Nested loop growth rate is Quadratic in proportion to n.
     */
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0; j < n; j++) // loop from 0 to n-1
            for (int k = 0; k <= j; k++) // loop from 0 to j
                total += arr[j];
        return total;

    }
    /**
     * Question-4
     * Code Fragment1  example 4
     * This is O(n).
     * Because the running time for the loop growth rate is linear in proportion to n.
     */
    public static int example4(int[ ] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j = 0; j < n; j++) { // loop from 0 to n-1
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }
    /**
     * Question-5
     * Code Fragment1  example 5
     * This is O(n^3).
     * Because the running time for the Nested loop growth rate is Cubed in proportion to n.
     */
    public static int example5(int[ ] first, int[ ] second) { // assume equal length arrays
        int n = first.length, count = 0;
        for (int i = 0; i < n; i++) { // loop from 0 to n-1
            int total = 0;
            for (int j = 0; j < n; j++) // loop from 0 to n-1
                for (int k = 0; k <= j; k++) // loop from 0 to j
                    total += first[k];
            if (second[i] == total) count++;

        }  return count;
    }

    /**
     * Question-6  A
     * for O(n)
     * To find the numbers if even number return 1 otherwise return 0;
     */

    public static int evens(int n){
        while (n!=0){
            int remainder= n%10;
            if(remainder%2!=0)
                return 0;
            n=n/10;
        }
        return 1;
    }
    /**
     * Question-6 B
     * for O(n log n)
     */
    public static void logn(int x){
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < x; j*=2) {
                System.out.println("I love Java Programing");
            }
        }
    }
    /**
     * Question-6 C
     * for O(n^3)
     */
    public static void cubic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j+=3) {
                for (int k = 0; k < arr.length; k+=2) {
                    System.out.println("Data Structure");
                }

            }
        }
    }
    /**  OR
     * Question-6 C
     * for O(n^3)
     * To check if it contains 7 then it does not contain 11
     * return 1; otherwise return 0;
     */
    public static int check(int[] a){
        boolean seven =false, eleven = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] ==7){
                for (int j = 0; j <a.length ; j++) {
                   if (a[j] ==11)
                       eleven= true;
                }
                if (!eleven) return 1;
                else if (eleven) return 0;
            }
            else if(a[i] ==11){
                for (int n = i+1; n < a.length; n++) {
                    if(a[n]==7){
                        seven=true;
                    }
                    if(seven) return 1;
                }
            }
        }
        return 0;
    }

    /**
     * Question-7
     * We focus the worst-case analysis is the maximum amount of
     * time that an algorithm require to solve the problem
     * of size n.
     * Or the longest running time performed by an algorithm
     *given any input of size n.
     */
}

package assignment3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    private int[] arr;

    //private int size = 0;
    public void insert() {
        Random rand = new Random();
        arr = new int[arr.length];
        for (int i = 0; i < 50; i++) {
            arr[i] = rand.nextInt(100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
    }

    public void removeDuplicates() {
        int size = size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[size - 1];
                    j--;
                    size--;
                }
            }
        }
        remove(size);

    }

    public int size() {
        return arr.length;
    }

    public void remove(int index) {
        if (index < arr.length) {
            int[] temp = new int[index];
            for (int i = 0; i < index; i++) {
                temp[i] = arr[i];
            }
            arr = new int[index];
            arr = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void clear() {
        int[] temp = new int[0];
        arr = temp;

//        for (int i = arr.length - 1; i >= 0; i--) {
//            remove(i);
//        }
    }

    public int get(int index) {
        if (index < 0 || index >= arr.length)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }

    public int[] subList(int start, int end) {
        if ((start < 0 || start >= size()) || (end < 0 || end >= size()))
            throw new ArrayIndexOutOfBoundsException();
        int index;
        if (start >= end) {
            throw new IllegalArgumentException();
        }
        int length = end - start;
        int value[] = new int[length];
        index = start;
        for (int i = 0; i < length; i++) {
            value[i] = arr[index];
            index++;
        }
        return value;
    }

    public int set(int index, int newValue) {
        if (index < 0 || index >= arr.length)
            throw new ArrayIndexOutOfBoundsException();
        int oldVal = arr[index];
        arr[index] = newValue;
        return oldVal;
    }


    public static void main(String[] args) {

        RandomArray list = new RandomArray();
        list.insert();
        System.out.println("Removing duplicates: ");
        list.removeDuplicates();
        System.out.println("=========================");
        System.out.println("To check sublist");
        int[] ans = list.subList(15, 20);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int lis = list.size();
        System.out.println(lis);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        list.clear();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.insert();

    }
}
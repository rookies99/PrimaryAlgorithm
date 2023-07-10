package _基本算法;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    @Test
    public void test1() {
        int[] arr = {5, 1, 3, 7, 8, 4};
        System.out.println(arr[arr.length-1]);
        System.out.println("sortableArray(arr) = " + Arrays.toString(sortableArray(arr)));
    }

    /**
     * 分区
     * @param array
     * @return
     */
    public int[] sortableArray(int[] array) {
//        Random random = new Random();
//        int randomNum = random.nextInt(array.length-1+1);
        int randomNum = array.length-1;
        System.out.println("randomNum = " + array[randomNum]);
        int left = 0;
        int right = array.length-2;
        int temp;
        int pivot = array[randomNum];
        while (left <= right) {
            while (array[left] < pivot ) {
                left++;
            }
            while (array[right] > pivot ) {
                right--;
            }
            if (left <= right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        temp = array[randomNum];
        array[randomNum] = array[left];
        array[left] = temp;
        return array;
    }


    public int[] quickSort(int[] arr, int left, int right) {

        return arr;
    }

}

package _基本算法;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    private int count = 0;

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[2000];
        int[] arr2 = {5, 1, 3, 6, 7, 4};
        for (int i = 0; i < 2000; i++) {
            arr[i] = random.nextInt(1000000-1+1)+1;
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("count: "+count);
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }

    /**
     * 分区
     * @param array
     * @return
     */
    public int sortableArray(int[] array,int left,int right) {
//        Random random = new Random();
//        int randomNum = random.nextInt(array.length-1+1);
        int pivot_position = right;
        int pivot = array[pivot_position];
        right -= 1; // 数组将轴排除进行比较
        while (left < right) {
            while (array[left] < pivot) {
                left+=1;
            }
            while (right>0 && array[right] > pivot ) {
                right-=1;
            }
            if (left >= right) {
                break;
            } else {
                swap(array, left, right);
            }
        }
        swap(array, left, pivot_position);
        return left;
    }

    /**
     * 快速排序  O(logN)  特点是分区、递归
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot_position = sortableArray(arr, left, right); // 将数组以轴分成两部分
        count++;
        quickSort(arr, left, pivot_position -1);
        quickSort(arr,pivot_position+1,right);
    }

    /**
     * 下标交换
     * @param arr
     * @param pointer_1
     * @param pointer_2
     */
    public void swap( int[] arr, int pointer_1, int pointer_2) {
        int temp = arr[pointer_1];
        arr[pointer_1] = arr[pointer_2];
        arr[pointer_2] = temp;
    }


}

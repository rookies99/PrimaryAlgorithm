package _基本算法;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[20000];
        for (int i = 0; i < 20000; i++) {
            arr[i] = random.nextInt(1000000-1+1)+1;
        }
        long start = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
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
            while (array[right] > pivot) {
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
        quickSort(arr, left, pivot_position -1);
        quickSort(arr,pivot_position+1,right);

//        // 总是取最右的值作为轴
//        int pivot_position = right;
//        int pivot = arr[pivot_position];
//        right-=1; // 数组将轴排除进行比较
//        while (true) {
//            while (arr[left] <= pivot) {
//                left++;
//            }
//            while (arr[right] >= pivot) {
//                right--;
//            }
//            if (left >= right) {
//                break;
//            } else {
//                swap(arr,left,right);
//            }
//        }
//        swap(arr,left,pivot_position);
//        return arr;
    }

    public void swap( int[] arr, int pointer_1, int pointer_2) {
        int temp = arr[pointer_1];
        arr[pointer_1] = arr[pointer_2];
        arr[pointer_2] = temp;
    }

}

package _基本算法.soft;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    private int count = 0;

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[900000];
        int[] arr2 = {1,3,2,4,6,5,8,9,10,7,15,12,14,13};
        for (int i = 0; i < 900000; i++) {
            arr[i] = random.nextInt(1000000-1+1)+1;
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("count: "+count);
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }

    /**
     * 双边循环：双指针分区更平衡，更好处理大量重复元素。
     * @param array
     * @return
     */
    public int double_pointer_partition(int[] array,int left,int right) {
        int pivotIndex = right;
        int pivot = array[pivotIndex]; // 基准值选择数组最后一个元素
        right--;// 右指针 从基准值左边一个元素开始，排除基准元素
        while (left<=right) {
            while (left <= right && array[left] <= pivot) {
                left += 1; // 左指针向右移动，找到大于基准元素的值
            }
            while (left <= right && array[right] > pivot) {
                right -= 1; // 右指针向左移动，找到小于等于基准元素的值
            }
            if (left < right) {
                swap(array, left, right);
            }
        }
        swap(array, left, pivotIndex);// 双指针重合 跟基准元素交换位置
        return left; // 返回基准元素的下标
    }

    /**
     * 单边循环：单指针所以空间复杂度较优
     * @param array
     * @param left
     * @param right
     * @return
     */
    public int single_pointer_partition(int[] array,int left,int right) {
        int pivot = array[right]; // 选择基准元素，这里使用最后一个元素作为基准
        int i = left; // 初始化 左指针

        // 遍历数组元素，将小于等于基准元素的元素放在左侧
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                swap(array, i, j);
                i++; // 指针向右移动
            }
        }
        swap(array, i, right); // 将基准元素放置到正确的位置
        return i;
    }

    /**
     * 快速排序  O(logN)  特点是分区、递归，性能极快
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public void quickSort(int[] arr, int left, int right) {
        if (left<right) {
            int pivot_position = double_pointer_partition(arr, left, right); // 将数组以轴分成两部分
            count++;
            quickSort(arr, left, pivot_position -1);
            quickSort(arr,pivot_position+1,right);
        }

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

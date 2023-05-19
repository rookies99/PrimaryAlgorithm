package _基本算法;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSort {

    /**
     * 用于测试算法结果
     */
    @Test
    public void test1() {
        int[] arr = {10,9,8,6,4,3,2,1,0};
        System.out.println("Arrays.toString(selectionSort(arr)) = " + Arrays.toString(selectionSort(arr)));
    }

    /**
     * 选择排序：时间复杂度 O(n²)
     * @param arr
     * @return int[]
     */
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 优化后 下标放在循环内，保证赋值无误
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //交换的下标
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}

package _基本算法;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void test1() {
        int[] arr = {4, 5, 1, 3, 2, 6, 10};
        System.out.println("bubbleSort(arr) = " + Arrays.toString(bubbleSort(arr)));
    }


    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr) {
        int temp;
        boolean flag = false;//如果传入有序数组 直接跳出循环
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }
}

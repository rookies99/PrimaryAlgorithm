package _基本算法.soft;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    /**
     * 用于测试算法结果
     */
    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(100-1+1)+1;
        }
        long start = System.currentTimeMillis();
        System.out.println("Arrays.toString(selectionSort(arr)) = " + Arrays.toString(selectionSort(arr)));
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }

    /**
     * 选择排序：1.从第一个元素开始，设第一个元素为最小值跟右边元素逐个比较找出最小值
     * 2.如果找到更小的，则跟第一个元素进行交换
     * 3.从第2个元素开始重复上述步骤直至完成排序。
     *
     * @param arr
     * @return int[]
     */
    public int[] selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
